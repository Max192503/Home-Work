package by.overone.lesson9;

public class Atm {
    public int bankNote20;
    public int bankNote50;
    public int bankNote100;
    public int totalMoney;
    public int sum;

    public Atm(int bankNote20, int bankNote50, int bankNote100) {
        this.bankNote20 = bankNote20;
        this.bankNote50 = bankNote50;
        this.bankNote100 = bankNote100;
    }

    public void setBankNote20(int bankNote20) {
        if (bankNote20 <= 1) {
            System.out.println("Automatic replenishment of banknotes with 20 bills");
            this.bankNote20 += 10;
        } else {
            System.out.println("20 bills in an ATM");
        }
    }

    public void setBankNote50(int bankNote50) {
        if (bankNote50 <= 1) {
            System.out.println("Automatic replenishment of banknotes with 50 bills");
            this.bankNote50 += 10;
        } else {
            System.out.println("50 bills in an ATM");
        }
    }

    public void setBankNote100(int bankNote100) {
        if (bankNote100 <= 1) {
            System.out.println("Automatic replenishment of banknotes with 100 bills");
            this.bankNote100 += 10;
        } else {
            System.out.println("100 bills in an ATM");
        }
    }

    public void TotalMoney() {
        this.totalMoney = bankNote20 * 20 + bankNote50 * 50 + bankNote100 * 100;
        System.out.println("Total money in the ATM " + totalMoney);
    }

    public void setSum(int sum) {

        this.sum = sum;
        int temp100 = 0;
        int temp50 = 0;
        int temp20 = 0;

        if (sum < 0) {
            System.out.println("Invalid data entered");
        } else if (sum > totalMoney) {
            System.out.println("Not enough money at the ATM");
        } else if (sum < 20) {
            System.out.println("No small bills, minimum amount 20");
        } else if (sum < totalMoney) {
            while (temp100 * 100 <= sum && temp100 != bankNote100) {
                if (temp100 == sum || sum - temp100 * 100 < 100) {
                    break;
                } else {
                    temp100++;
                }
            }
            System.out.println("Banknotes issued in denominations of 100 " + temp100);
        }

        int remainder = sum - temp100 * 100;
        if (remainder % 50 >= 0) {
            while (temp50 * 50 <= remainder && temp50 != bankNote50) {
                if (remainder - temp50 * 50 < 50 || remainder - temp50 * 50 >= 80 && remainder - temp50 * 50 <= 89
                        || remainder - temp50 * 50 >= 60 && remainder - temp50 * 50 <= 69) {
                    break;
                } else {
                    temp50++;
                }
            }
            System.out.println("Banknotes issued in denominations of 50 " + temp50);
        }

        remainder = sum - temp100 * 100 - temp50 * 50;
        if (sum <= totalMoney && remainder > 0) {
            while (temp20 * 20 <= remainder && temp20 != bankNote20) {
                if (temp20 * 20 == remainder || remainder - temp20 * 20 < 20) {
                    break;
                } else {
                    temp20++;
                }
            }
            System.out.println("Banknotes issued in denominations of 20 " + temp20);
        }

         remainder = sum - temp100 * 100 - temp50 * 50 - temp20 * 20;
        if (remainder < 20 && remainder > 0) {
            System.out.println(remainder + " Not issued" + "\n" + "No small bills, minimum amount 20");
        }
    }
}
