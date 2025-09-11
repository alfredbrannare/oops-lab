package labs.streams.service;

import labs.streams.entities.Country;
import labs.streams.entities.CountryList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

}
