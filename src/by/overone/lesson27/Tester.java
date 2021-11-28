package by.overone.lesson27;

import java.util.Objects;
import java.util.regex.Pattern;

public class Tester {
    private int id;
    private String name;

    public Tester(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        Tester tester = (Tester) o;
        return id == tester.id && Objects.equals(name, tester.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
