package labs.streams;

import labs.streams.entities.Country;
import labs.streams.service.CountryPrinter;
import labs.streams.service.CountryService;

import java.util.List;

public class CountryApp {
    static void main(String[] args) {
        CountryService countryService = new CountryService();
        CountryPrinter countryPrinter = new CountryPrinter();

        countryPrinter.printCountries("First and Last Country", countryService.getFirstAndLastCountry());

        System.out.println("Countries with Population more than 10000000:");

    }
}
