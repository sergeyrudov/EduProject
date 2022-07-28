package pattern;

import patterns.fabricMethod.Builder;

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


    }
}
