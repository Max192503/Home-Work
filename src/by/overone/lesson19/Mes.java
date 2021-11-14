package by.overone.lesson19;

public class Mes <T extends Number> {
        private T num;
        private T num1;

        public Mes(T num, T num1) {
                this.num = num;
                this.num1 = num1;
        }

          public Mes(){
        }

        public T getNum() {
                return num;
        }

        public T getNum1() {
                return num1;
        }

}
