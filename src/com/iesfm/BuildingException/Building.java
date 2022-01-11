package com.iesfm.BuildingException;

import java.util.Arrays;
import java.util.Objects;

public class Building {

    private String direction;
    private String town;
    private Apartment[] apartments;

    public Building(String direction, String town, Apartment[] apartments) {
        this.direction = direction;
        this.town = town;
        this.apartments = apartments;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(direction, building.direction) && Objects.equals(town, building.town) && Arrays.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(direction, town);
        result = 31 * result + Arrays.hashCode(apartments);
        return result;
    }
}
