package Streams;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.*;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ExtractingResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;


public class SomeTestOne {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient("https://google.com");
        apiClient.title();


        checkText(() -> isEmpty("Hello"), " String is empty");

    }

    static String isEmpty(String verifyMessage) {
        if(!verifyMessage.isEmpty()) {
            return verifyMessage;
        } else {
            throw new IllegalArgumentException();
        }
    }


    static void checkText(Runnable method, String message) {
        Logger logger = org.slf4j.LoggerFactory.getLogger(SomeTestOne.class);
        try {
            method.run();
        } catch (Exception e) {
            logger.error(e.getMessage() + message);
        }
    }
}



class RestFactory {
    private static RestTemplate restTemplate;

    public static RestTemplate create() {
        if (Objects.isNull(restTemplate)) {
            System.out.println("Create rest client");
            ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
            MappingJackson2HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();

            // Byte convertor (for application/pdf as example)
            ByteArrayHttpMessageConverter byteConvertor = new ByteArrayHttpMessageConverter();
            byteConvertor.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

            jacksonConverter.setObjectMapper(mapper);
            jacksonConverter.setPrettyPrint(true);

            RestTemplate rest = new RestTemplate(factory);

            rest.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
            rest.setMessageConverters(Arrays.asList(jacksonConverter, byteConvertor));
            rest.setInterceptors(Collections.singletonList(new ClientHttpRequestInterceptor() {
                @NotNull
                @Override
                public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
                    return null;
                }
            }));
            rest.setErrorHandler(new ExtractingResponseErrorHandler());
            restTemplate = rest;
        }
        return restTemplate;

    }
}
abstract class ApiBase <C extends ApiBase, RESP extends String, BODY extends String> {
    protected String host;
    protected final RestTemplate rest;
    private final HttpHeaders headers = new HttpHeaders();

    public ApiBase(RestTemplate rest) {
        this.rest = rest;
    }

    protected abstract Class<RESP> mapToClass();

    public C setHost(String host) {
        this.host = host;
        return (C) this;
    }

    public RESP build(BODY builder) {
        String path = "https://google.com";

        HttpEntity<BODY> entity = new HttpEntity<>(builder, headers);

        return rest.postForEntity(path, entity, mapToClass()).getBody();
    }

}
class Response extends ApiBase<Response, String, String> {
    public Response(RestTemplate rest) {
        super(rest);
    }

    @Override
    protected Class<String> mapToClass() {
        return String.class;
    }
}


class ApiClient {
    String host;
    RestTemplate rest;
    private Map<String, ApiBase> cache = new ConcurrentHashMap<>();

    public ApiClient(String host) {
        this.host = host;
        this.rest = RestFactory.create();
    }

    public Response title() {
        String defaultUrl = "https://google.com";
        Function<String, Response> createValue = key -> new Response(rest).setHost(host);
        return (Response) cache.computeIfAbsent(defaultUrl, createValue);
    }

}
