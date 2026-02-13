package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Creates a City using the provided name and province.
     * @param city The city name.
     * @param province The province name.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name.
     * @return The city name.
     */
    String getCityName(){

        return this.city;
    }

    /**
     * Returns the province name.
     * @return The province name.
     */
    String getProvinceName(){

        return this.province;
    }

    /**
     * Compares cities by name.
     * @param other The other city to compare to.
     * @return A negative, zero, or positive integer as this city name is less
     * than, equal to, or greater than the specified city name.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());  // this.city refers to the city name
    }

    /**
     * Checks equality based on city and province names.
     * @param other The object to compare to.
     * @return True when both city and province names match.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof City)) {
            return false;
        }
        City otherCity = (City) other;
        return this.city.equals(otherCity.city) && this.province.equals(otherCity.province);
    }

    /**
     * Returns a hash code consistent with equals.
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}
