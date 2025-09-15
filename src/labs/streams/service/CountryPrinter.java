package labs.streams.service;

import labs.streams.entities.Country;

import java.util.List;
import java.util.Map;

public class CountryPrinter {

    public void printCountries(String title, Country country) {
        System.out.println(title);
        System.out.println(country.country() + " | Population: " + country.population());
        System.out.println();
    }

    public void printCountries(String title, double averageArea, int belowAverage) {
        System.out.println(title);
        System.out.println("Average Area: " + averageArea + " | Countries Below Average: " + belowAverage);
        System.out.println();
    }

    public void printCountries(String title, List<Country> countries) {
        System.out.println(title);
        for (Country country : countries) {
            System.out.println(country.country() + " | " + country.capital() +
                    " | Pop: " + country.population() + " | Area: " + country.area());
        }
        System.out.println();
    }

    public void printCountryNames(String title, List<Country> countries) {
        System.out.println(title);
        for (Country country : countries) {
            System.out.println(country.country() + " | " + country.capital());
        }
        System.out.println();
    }

    public void printCountryAndPopulation(String title, List<Country> countries) {
        System.out.println(title);
        for (Country country : countries) {
            System.out.println(country.country() + " | " + country.population());
        }
        System.out.println();
    }

    public void printCountryAndArea(String title, List<Country> countries) {
        System.out.println(title);
        for (Country country : countries) {
            System.out.println(country.country() + " | " + country.area());
        }
        System.out.println();
    }

    public void printAreaCounts(String title1, int count1, String title2, int count2, String title3, int count3) {
        System.out.println(title1 + ": " + count1);
        System.out.println(title2 + ": " + count2);
        System.out.println(title3 + ": " + count3);
        System.out.println();
    }

    public void printCountryAndArea(String title, Map<Character, Integer> countryInitialsMap) {
        System.out.println(title);
        countryInitialsMap
                .forEach((initial, count) -> System.out.println(initial + ": " + count));
        System.out.println();
    }

    public void printCountryAndPopulation(String title, Map<Integer, List<Country>> countriesWithXPopulation) {
        System.out.println(title);

        countriesWithXPopulation.keySet().stream()
                .sorted()
                .forEach(population -> {
                    System.out.println("Countries with " + population + " million inhabitants");
                    countriesWithXPopulation.get(population).forEach(country ->
                            System.out.println("- " + country.country())
                    );
                });

        System.out.println();
    }

    public void printCountryAndActualPopulation(String test, Map<String, Long> actualCountryPopulationValue) {
    System.out.println(test);
    actualCountryPopulationValue.forEach((country, population) -> {
        System.out.println(country + " | " + population);
            }
    );
        System.out.println();
    }

    public void printCountryOvercrowdedness(String title, Map<String, Double> overcrowdingByCountry) {
        System.out.println(title);
        overcrowdingByCountry.forEach((country, overcrowding) -> {
            System.out.println(country + " | " + overcrowding + " people/km²");
        });
        System.out.println();
    }

    public void printReversedCapitalNamesInOrder(String title, Map<String, Country> countriesByReversedCapitalName) {
    System.out.println(title);
    countriesByReversedCapitalName.keySet()
            .stream()
            .forEach(System.out::println);
    }

    public void print6SmallestAnd3LargestCountryPopulationBasedOnArea(String title, Map<String, Double> combinedPopulationOf6SmallestAnd3LargestCountries) {
        System.out.println(title);
        combinedPopulationOf6SmallestAnd3LargestCountries.keySet()
                .stream()
                .forEach(population -> {
                    System.out.println(population);
                    System.out.println(combinedPopulationOf6SmallestAnd3LargestCountries.get(population));
                    System.out.println();
                });
    }

    public void printTotalPopulationForSevenLetterCountries(String title, Map<String, Double> totalPopulationForSevenLetterCountries) {
        System.out.println(title);
        totalPopulationForSevenLetterCountries.keySet()
                .stream()
                .forEach(countries -> System.out.println(countries + ": " + totalPopulationForSevenLetterCountries.get(countries))
                );
    }
}