package by.overone.lesson28work;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatTest {

    Calculat calculat = new Calculat();

    @BeforeAll
    static void say() {
        System.out.println("A");
    }

    @Test
    void sum() {
        int a = 5;
        int b = 5;

        Assertions.assertEquals(9, calculat.sum(a, b));
    }

    @Test
    void mul() {
        int a = 5;
        int b = 5;

        Assertions.assertEquals(25, calculat.mul(a, b));
    }

    @Test
    void div() {
        int a = 5;
        int b = 5;
        Assertions.assertEquals(1, calculat.div(a, b));
    }

    @Test
    void min() {
        int a = 5;
        int b = 5;
        Assertions.assertEquals(0, calculat.min(a, b));
    }
}
