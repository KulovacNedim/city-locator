package dev.ned.city.locator.models;

import java.util.Objects;

public class State {
    private Long id;
    private String name;

    public State() {
    }

    public State(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Objects.equals(id, state.id) &&
                Objects.equals(name, state.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
