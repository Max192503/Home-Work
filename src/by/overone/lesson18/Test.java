package by.overone.lesson18;


public class Test {

    public static void main(String[] args) {

        // Test of the first task.

        Pair pair = new Pair("hjj", 4.5);
        System.out.println(pair);
        PairUtil.swap(pair);
        System.out.println(pair);

        // Test of the second task.

        Solution<Integer> num = new Solution<Integer>();
        num.setNum(34);
        System.out.println(Solution.multiply(num));
    }
}
