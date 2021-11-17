package by.overone.lesson25;


class Task3 extends Exception {
}

class SimpleExceptionDemo {
    public void f() throws Task3 {
        System.out.println("Throwing SimpleException from f()");
        throw new Task3();
    }


    public static void main(String[] args) {
        SimpleExceptionDemo sed = new SimpleExceptionDemo();
        try {
            sed.f();
        } catch (Task3 e) {
            System.err.println("Caught it!");
        }
    }
}


