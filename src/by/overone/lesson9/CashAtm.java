package by.overone.lesson9;

import java.util.Scanner;

public class CashAtm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atm atm = new Atm(56, 77, 34);

        atm.setBankNote20(atm.bankNote20);
        System.out.println(atm.bankNote20);

        atm.setBankNote50(atm.bankNote50);
        System.out.println(atm.bankNote50);

        atm.setBankNote100(atm.bankNote100);
        System.out.println(atm.bankNote100);

        atm.TotalMoney();

        System.out.println("Enter the amount");
        atm.setSum(scanner.nextInt());

    }
}
