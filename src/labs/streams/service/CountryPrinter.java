package labs.streams.service;

import labs.streams.entities.Country;
import java.util.List;

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
}