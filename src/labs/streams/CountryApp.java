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

        countryPrinter.printAreaCounts(
                "Countries with Area Above 10K", countryService.getCountriesWithAreaAbove10K().size(),
                "Countries with Area Above 100K", countryService.getCountriesWithAreaAbove100K().size(),
                "Countries with Area Above 1M", countryService.getCountriesWithAreaAbove1M().size());

        countryPrinter.printCountryNames("Country Name and Capital Name Start with Same Letter", countryService.getCountriesWithSameInitialAsCapital());
        countryPrinter.printCountryNames("Countries where country name is longer than capital name", countryService.getCountryNameLongerThanCapitalName());
        countryPrinter.printCountryAndPopulation("5 first countries with least population", countryService.get5FirstWithLeastPopulation());

    }
}