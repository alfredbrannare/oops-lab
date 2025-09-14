package labs.streams.service;

import labs.streams.entities.Country;
import labs.streams.entities.CountryList;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.*;
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

    public List<Country> getBelowAverageAreaCountries() {
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

    public List<Country> get5FirstWithLeastPopulation() {
        return countries.stream()
                .sorted(Comparator.comparing(Country::population))
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Country> get3FirstWithLeastPopulationAbove7M() {
        return countries.stream()
                .filter(c -> c.population() > 7.0)
                .sorted(Comparator.comparing(Country::population))
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Country> getUpTo3CountriesWithAreaAbove500K() {
        return countries.stream()
                .filter(c -> c.area() > 5_00_000)
                .sorted(Comparator.comparing(Country::country).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }


    public Map<Character, Integer> getCountryInitialsMap() {
        return countries.stream()
                .map(Country::country)
                .filter(name -> !name.isEmpty())
                .map(name -> name.charAt(0))
                .collect(Collectors.toMap(name -> name, name -> 1, Integer::sum));
    }

    public Map<Integer, List<Country>> getCountriesWithXPopulation() {
        return countries.stream()
                .collect(Collectors.groupingBy(
                        c -> (int) Math.floor(c.population()),
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Country::country))
                                        .collect(Collectors.toList())
                        )
                ));
    }


    public Map<String, Long> getActualCountryPopulationValue() {
        return countries.stream()
                .collect(Collectors.toMap(Country::country, c -> (long) (c.population() * 1_000_000)));
    }

    public Map<String, Double> getOvercrowdingByCountry() {
        return countries.stream()
                .collect(Collectors
                        .toMap(Country::country,
                                c -> (
                                        (Math.round((c.population() * 1_000_000) / c.area()) * 100.0) / 100.0)));
    }

    public Map<String, Country> getCountriesByReversedCapitalName() {
        return countries.stream()
                .sorted(Comparator.comparing(
                        c -> new StringBuilder(c.capital()).reverse().toString()))
                .collect(Collectors.toMap(c -> new StringBuilder(c.capital()).reverse().toString(), c -> c,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    public Map<String, List<Country>> getCombinedPopulationOf6SmallestAnd3LargestCountries() {
        return countries.stream()
                .sorted(Comparator.comparing(Country::area))
                .collect(Collectors.teeing(
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                (List<Country> list) -> list
                                        .stream()
                                        .limit(6)
                                        .toList()
                        ),
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                (List<Country> list) -> list
                                        .stream()
                                        .skip(Math.max(0, list.size() - 3))
                                        .toList()
                        ),
                        (firstSix, lastThree) -> Map.of(
                                "6 Smallest", firstSix,
                                "3 Largest", lastThree
                        )
                ));

    }
}
