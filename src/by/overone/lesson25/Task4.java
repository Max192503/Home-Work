package by.overone.lesson25;

public class Task4 extends RuntimeException {



    public Task4(String message) {
        super(message);
    }
        @Override
        public String toString() {
            return "Task4{}";
        }

    }
    
     class SimpleExceptionDemo1 {
        public void a() throws Task4 {
            System.out.println("Throwing SimpleException from f()");
            throw new Task4("Caught it!");
        }
    
        public static void main(String[] args) {
            SimpleExceptionDemo1 sed1 = new SimpleExceptionDemo1();
            try {
                sed1.a();
            } catch (Task4 e) {
                System.err.println("Caught it!");
            }
        }
     }
