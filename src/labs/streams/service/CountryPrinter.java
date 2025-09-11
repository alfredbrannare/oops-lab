package labs.streams.service;

import labs.streams.entities.Country;

import java.util.List;


public class CountryPrinter {
    public void printCountries(String title, double area) {
        dynamicHeader(title, "%-15s %-10s", List.of("Country", "Area"));
        System.out.println(String.format("%-15s %-10s",
                "Average Area",
                area
                ));
        footer();
    }

    public void printCountries(String title, Country country) {
        dynamicHeader(title, "%-15s %-10s", List.of("Country", "Population"));
        System.out.println(String.format("%-15s %-10s",
                country.country(),
                country.area()));
        footer();
    }

    public void printCountries(String title, List<Country> countries) {
        dynamicHeader(title, "%-15s %-15s %-12s %-10s", List.of("Country", "Capital", "Population", "Area"));
        countries.stream()
                .map(c -> String.format("%-15s %-15s %-12s %-10s",
                        c.country(),
                        c.capital(),
                        c.population(),
                        c.area()))
                .forEach(System.out::println);
        footer();
    }

    // Helper Methods
    private static void dynamicHeader(String title, String format, List<String> headers) {
        System.out.println("==============================================================================================");
        System.out.println("-- " + title + " --");
        System.out.printf(format, headers.toArray());
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------");

    }

    private static void footer() {
        System.out.println("==============================================================================================");
        System.out.println(); // prints a blank line
    }
}
