package dev.ned.city.locator.models;

import java.util.Objects;

public class City {
    private Long id;
    private String name;
    private State state;

    public City() {
    }

    public City(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(id, city.id) &&
                Objects.equals(name, city.name) &&
                Objects.equals(state, city.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, state);
    }
}


