package labs.streams;

import labs.streams.service.CountryPrinter;
import labs.streams.service.CountryService;

public class CountryApp {
    static void main(String[] args) {
        CountryService countryService = new CountryService();
        CountryPrinter countryPrinter = new CountryPrinter();

        // 2. Skriv ut namnet på det första och det sista landet i listan på konsolen.
        countryPrinter.printCountries("First and Last Country", countryService.getFirstAndLastCountry());

        // 3. Skriv ut namnen på alla länder i listan, sorterade i bokstavsordning
        countryPrinter.printCountries("Countries Sorted (A-Z)", countryService.getCountriesSortedAlphabetically());

        // 4. Skriv ut namnen på alla länder i listan, sorterade efter befolkning, med den högsta befolkningen
        //först.
        countryPrinter.printCountries("Countries Sorted (Population)", countryService.getCountriesSortedByPopulation());

        // 5. Skriv ut vilken den största befolkningsmängden är.
        countryPrinter.printCountries("Country with Highest Population", countryService.getHighestPopulatedCountry());

        // 6. Skriv ut genomsnittsarean och hur många länder som har en mindre area än genomsnittet.
        countryPrinter.printCountries("Average Country Area", countryService.getAverageCountryArea(), countryService.getBelowAverageAreaCountries().size());

        // 7. Skriv ut namnen på alla länder som har en befolkning som är mindre än 5 miljoner.
        countryPrinter.printCountries("Countries with Population Below 5(M)", countryService.getCountriesBelow5Mil());

        // 8. Använd tre queries för att skriva ut hur många länder som har en area över 10 000, över 100 000 och över 1 000 000 respektive.
        countryPrinter.printAreaCounts(
                "Countries with Area Above 10K", countryService.getCountriesWithAreaAbove10K().size(),
                "Countries with Area Above 100K", countryService.getCountriesWithAreaAbove100K().size(),
                "Countries with Area Above 1M", countryService.getCountriesWithAreaAbove1M().size());

        // 9. Skriv ut namn och huvudstad för alla länder vars huvudstad börjar på samma bokstav som landets namn.
        countryPrinter.printCountryNames("Country Name and Capital Name Start with Same Letter", countryService.getCountriesWithSameInitialAsCapital());

        // 10 Skriv ut alla land vars namn är längre än namnet på deras huvudstad.
        countryPrinter.printCountryNames("Countries where country name is longer than capital name", countryService.getCountryNameLongerThanCapitalName());

        // 11 Skriv ut de fem första länderna som har minst folkmängd.
        countryPrinter.printCountryAndPopulation("5 first countries with least population", countryService.get5FirstWithLeastPopulation());

        /* 12 Skriv ut de tre första länderna som har minst folkmängd och över 7 miljoner. Exempelvis
        kommer Norge inte med för det har bara 5 miljoner, men Sverige har 10 miljoner så det kommer med. */
        countryPrinter.printCountryAndPopulation("3 first countries with least population over 7m", countryService.get3FirstWithLeastPopulationAbove7M());

        // 13. Skriv ut namnen på upp till tre länder som har en area på minst 500 000 km2, sorterade fallande efter namn.
        countryPrinter.printCountryAndArea("Up to 3 countries with an area of at least 500 000 km2", countryService.getUpTo3CountriesWithAreaAbove500K());

        /* 14. Skriv ut hur många länder det finns som börjar på varje bokstav som finns i listan. Exempelvis
        så finns det tre länder vars namn börjar på S, ett som börjar på D och två som börjar på F. */
        countryPrinter.printCountryAndArea("Countries sharing initial letter", countryService.getCountryInitialsMap());

        /* 15 Skriv ut hur många länder det finns som har en befolkning på X miljoner och deras namn.
        Sortera dem i bokstavsordning på namnet. Befolkningsmängden ska avrundas nedåt till ett heltal.
        Utskriften ska se ut ungefär så här:
        Länder med 0 miljoner invånare:
        - Island
        - Niue
        Länder med 3 miljoner invånare:
        - Mongoliet
        osv. */
        countryPrinter.printCountryAndPopulation("Test", countryService.getCountriesWithXPopulation());

        /* 16a Skriv ut namnet och befolkningsmängden för alla länder, men räkna om befolkningsmängden
        till faktiska tal. Alltså ska till exempel 1.5 miljoner skrivas ut som 1500000. */
        countryPrinter.printCountryAndActualPopulation("Test", countryService.getActualCountryPopulationValue());

    }
}