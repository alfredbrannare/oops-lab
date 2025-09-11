package labs.streams;

import labs.streams.entities.Country;
import labs.streams.service.CountryService;

import java.util.List;

public class CountryApp {
    static void main(String[] args) {
        CountryService countryService = new CountryService();
        System.out.println("First and last country:");
        List<Country> countries = countryService.getFirstAndLastCountry();
        countries.stream()
                .map(c -> c.country() + " - " + c.capital()
                        + " (" + c.population() + "M, " + c.area() + " km²)")
                .forEach(System.out::println);

    }
}
