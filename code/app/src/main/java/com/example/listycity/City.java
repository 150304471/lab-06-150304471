package com.example.listycity;

import java.util.Objects;
/**
 * This class defines a City object, holding its name and the province it belongs to.
 */
public class City implements Comparable<City>{
    /** The name of the city. */
    private String city;
    /** The province where the city is located. */
    private String province;

    /**
     * Constructs a new City object with the specified city and province names.
     * @param city The name of the city.
     * @param province The name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * Retrieves the name of the city.
     * @return The city's name as a String.
     */
    String getCityName(){
        return this.city;
    }
    /**
     * Retrieves the name of the province.
     * @return The province's name as a String.
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City otherCity) {
        return this.city.compareTo(otherCity.getCityName()); // this.city refers to the city name
    }

    /**
     * Compares this City object to another object
     * Two cities are equal if the city names are the same.
     * @param o The object to compare with.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city);
    }

    /**
     * Returns a hash code value for the City object, based on the city name.
     * @return The hash code based on the city name.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.city);
    }
}
