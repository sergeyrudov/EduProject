package pattern;

import groovy.util.logging.Slf4j;
import lombok.Builder;
import org.junit.ClassRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;
import two.CacheExperience;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Country {
    private String language;
    private String countryName;
    private String capital;
    private String currency;
    private Integer population;



    public static Builder countryBuilder() {
        return new Builder();
    }



    public static class Builder {
        private  Country newCountry;

        public Builder() {
            newCountry = new Country();
        }

        public Builder setLanguage(String language) {
            newCountry.language = language;
            return this;
        }

        public Builder setCountryName(String countryName) {
            newCountry.countryName = countryName;
            return this;
        }

        public Builder setCapital(String capital) {
            newCountry.capital = capital;
            return this;
        }

        public Builder setCurrency(String currency) {
            newCountry.currency = currency;
            return this;
        }

        public Builder setPopulation(Integer population) {
            newCountry.population = population;
            return this;
        }

        public Country build(){
            return  newCountry;
        }
    }
}

@Builder
class Computer {
    String cpuVendor;
    int ssdSize;
}

class DemoBuilder {
    public static void main(String[] args) {
        Country country = Country.countryBuilder()
                .setLanguage("java")
                .setCountryName("Russia")
                .setCapital("Moscow")
                .setCurrency("RUB")
                .setPopulation(14_000_000)
                .build();

        System.out.println(country);

        Computer computer = Computer.builder()
                .cpuVendor("Intel")
                .ssdSize(512)
                .build();
    }
}

