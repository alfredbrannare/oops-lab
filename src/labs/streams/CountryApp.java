package labs.streams;

import labs.streams.service.CountryPrinter;
import labs.streams.service.CountryService;

public class CountryApp {
    static void main(String[] args) {
        CountryService countryService = new CountryService();
        CountryPrinter countryPrinter = new CountryPrinter();

        countryPrinter.printCountries("First and Last Country", countryService.getFirstAndLastCountry());
        countryPrinter.printCountries("Countries Sorted (A-Z)", countryService.getCountriesSortedAlphabetically());
        countryPrinter.printCountries("Countries Sorted (Population)", countryService.getCountriesSortedByPopulation());
        countryPrinter.printCountries("Country with Highest Population", countryService.getHighestPopulatedCountry());
        countryPrinter.printCountries("Average Country Area", countryService.getAverageCountryArea(), countryService.getBelowAverageAreaCountries().size());
        countryPrinter.printCountries("Countries with Population Below 5(M)", countryService.getCountriesBelow5Mil());

    }
}
