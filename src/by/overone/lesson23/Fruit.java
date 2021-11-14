package by.overone.lesson23;

public class Fruit {

    private FruitPits fruitPits;

    public void setFruitPits(FruitPits fruitPits) {
        this.fruitPits = fruitPits;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitPits=" + fruitPits +
                '}';
    }

    class FruitPits {

        private int amount;

        public FruitPits(int amount) {
            this.amount = amount;
        }

        public void getAmount() {
            System.out.println(amount);
        }

        @Override
        public String toString() {
            return "FruitPits{" +
                    "amount=" + amount +
                    '}';
        }
    }

    public void amountFruitPits() {
        fruitPits = new FruitPits(fruitPits.amount);
        fruitPits.getAmount();
    }
}

