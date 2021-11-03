package by.overone.lesson21_1;


import java.util.HashSet;

public class Task {
    public static void main(String[] args) {
        Person ivan = new Person(0,"ivan");
        Person max = new Person(1,"maksim");
        Person olya = new Person(2,"olga");

        HashSet<Person> person =new HashSet<>();
        person.add(ivan);
        person.add(max);
        person.add(olya);

        for (Person person1 : person) {
            System.out.println(person);
        }

        Person sasha=new Person(3,"sasha");
        Person andrey =new Person(4,"andrey");
        person.add(andrey);
        person.add(sasha);

       // for (Person person1 : person) {
            System.out.println(person);

        person.remove(sasha);
        person.remove(max);

        for (Person person1 : person) {
            System.out.println(person);
        }
    }
}
