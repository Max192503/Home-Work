package by.overone.lesson12;

public class Student extends Person{


    @Override
    public void speak() {
        super.speak();
        System.out.println(" Я студент ");
    }
}
