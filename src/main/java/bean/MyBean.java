package bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@ToString
@Getter
public class MyBean {
    private final String name;
    private final int age;

}


@Configuration
class AppConfig {

    @Bean
    public MyBean myBean() {
        return new MyBean("Egor", 22);
    }
}


class Demo {
    public static void main(String[] args) {
        MyBean appConfig = new AppConfig().myBean();
        System.out.println(appConfig.getName());
        System.out.println(appConfig.getAge());
}
}
