package by.overone.lesson23;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit.FruitPits fruitPits = fruit.new FruitPits(8);
        fruit.setFruitPits(fruitPits);

        //Task1
        System.out.println(fruit);
        fruit.amountFruitPits();

        //task2
        System.out.println(fruitPits);
        fruitPits.getAmount();

        //Task3
        Fruit1.FruitPits1 fruitPits1 = new Fruit1.FruitPits1(6);
        System.out.println(fruitPits1);
        fruitPits1.getAmount();
        Fruit1.FruitPits1.demonstrationMethod();
    }
}
