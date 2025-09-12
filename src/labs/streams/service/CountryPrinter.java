package labs.streams.service;

import labs.streams.entities.Country;
import java.util.List;

public class CountryPrinter {

    public void printCountries(String title, int population) {
        System.out.println(title);
        System.out.println("Highest Population: " + population);
        System.out.println();
    }

    public void printCountries(String title, double area) {
        System.out.println(title);
        System.out.println("Average Area: " + area);
        System.out.println();
    }

    public void printCountries(String title, Country country) {
        System.out.println(title);
        System.out.println(country.country() + " - Area: " + country.area());
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

    public void printCountries(String title, double averageArea, int belowAverage) {
        System.out.println(title);
        System.out.println("Average Area: " + averageArea + " | Countries Below Average: " + belowAverage);
        System.out.println();
    }

    public void printCountries(String title1, int size, String title2, int size1, String title3, int size2) {
        System.out.println(title1);
        System.out.println("Size: " + size);
        System.out.println();
        System.out.println(title2);
        System.out.println("Size: " + size1);
        System.out.println();
        System.out.println(title3);
        System.out.println("Size: " + size2);
        System.out.println();
    }
}