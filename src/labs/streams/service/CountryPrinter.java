package labs.streams.service;

import labs.streams.entities.Country;

import java.util.List;

public class CountryPrinter {
    public void printCountries(String title, List<Country> countries) {
        System.out.println("==============================================================================================");
        System.out.println("-- " + title + " --");
        System.out.println(String.format("%-15s %-15s %-12s %-10s", "Country", "Capital", "Population(M)", "Area(km²)"));
        System.out.println("----------------------------------------------------------------------------------------------");

        countries.stream()
                .map(c -> String.format("%-15s %-15s %-12s %-10s",
                        c.country(),
                        c.capital(),
                        c.population(),
                        c.area()))
                .forEach(System.out::println);
        System.out.println("==============================================================================================");
        System.out.println("\n");
    }
}
