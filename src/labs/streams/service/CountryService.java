package labs.streams.service;

import jdk.jfr.Category;
import labs.streams.entities.Country;
import labs.streams.entities.CountryList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryService {
    private final List<Country> countries = new ArrayList<>(CountryList.COUNTRIES);

    public List<Country> getFirstAndLastCountry() {
        List<Country> result = new ArrayList<>();

        Country firstCountry = countries.stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("The country list is empty"));
        result.add(firstCountry);

        Country lastCountry = countries.stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalArgumentException("The country list is empty"));
        result.add(lastCountry);

        return result;
    }

    public List<Country> getCountriesSortedAlphabetically() {
        return countries.stream()
                .sorted(Comparator.comparing(Country::country))
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesSortedByPopulation() {
        return countries.stream()
                .sorted(Comparator.comparing(Country::population).reversed())
                .collect(Collectors.toList());
    }

    public Country getHighestPopulatedCountry() {
        return countries.stream()
                .max(Comparator.comparing(Country::population))
                .orElseThrow(() -> new IllegalArgumentException("The country list is empty"));
    }

    public double getAverageCountryArea() {
        return countries.stream()
                .mapToDouble(Country::area)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("The country list is empty"));
    }

    public List<Country> getBelowAverageAreaCountries(){
        return countries.stream()
                .filter(c -> c.area() < getAverageCountryArea())
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesBelow5Mil() {
        return countries.stream()
                .filter(c -> c.population() < 5.0)
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesWithAreaAbove10K() {
        return countries.stream()
                .filter(c -> c.area() > 10_000)
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesWithAreaAbove100K() {
        return countries.stream()
                .filter(c -> c.area() > 100_000)
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesWithAreaAbove1M() {
        return countries.stream()
                .filter(c -> c.area() > 1000_000)
                .collect(Collectors.toList());
    }

    public List<Country> getCountriesWithSameInitialAsCapital() {
        return countries.stream()
                .filter(c -> c.capital().charAt(0) == c.country().charAt(0))
                .collect(Collectors.toList());
    }

    public List<Country> getCountryNameLongerThanCapitalName() {
        return countries.stream()
                .filter(c -> c.country().length() > c.capital().length())
                .collect(Collectors.toList());
    }
}
