package com.example.listycity;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * This is a class that keeps a list of city objects
*/
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a specific city belongs in the list.
     * @param city The city object to check for.
     * @return true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Checks if a city is present in the list and removes it.
     * @param city The city object to delete.
     * @throws IllegalArgumentException if the city is not found in the list.
     */
    public void delete(City city) {
        if (!cities.remove(city)) {
            throw new IllegalArgumentException("City not found for deletion.");
        }
    }

    /**
     * Returns the total number of cities currently in the list.
     * @return The count of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }


}
