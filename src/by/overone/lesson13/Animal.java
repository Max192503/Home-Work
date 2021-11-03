package by.overone.lesson13;

import java.util.Objects;

public class Animal {

    private int id;
    private String name;
    private int countOfPaws;
    private boolean angry;


    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countOfPaws=" + countOfPaws +
                ", angry=" + angry +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && countOfPaws == animal.countOfPaws && angry == animal.angry && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countOfPaws, angry);
    }
}
