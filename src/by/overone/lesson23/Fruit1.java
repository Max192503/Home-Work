package by.overone.lesson23;

public class Fruit1 {


    private FruitPits1 fruitPits1;

    @Override
    public String toString() {
        return "Fruit1{" +
                "fruitPits1=" + fruitPits1 +
                '}';
    }

    static class FruitPits1 {

        private int amount;

        public FruitPits1(int amount) {
            this.amount = amount;
        }

        public void getAmount() {
            System.out.println(amount);
        }

        static public void demonstrationMethod() {
            System.out.println("Task3");
        }

        @Override
        public String toString() {
            return "FruitPits1{" +
                    "amount=" + amount +
                    '}';
        }
    }

    public void amountFruitPits() {
        fruitPits1 = new Fruit1.FruitPits1(fruitPits1.amount);
        fruitPits1.getAmount();

    }
}