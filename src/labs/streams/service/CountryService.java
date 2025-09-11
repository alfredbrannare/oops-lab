package labs.streams.service;

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
}
