package per.budictreas.jebew;

import per.budictreas.jebew.core.MathUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("   5! = " + MathUtil.getFactorial(5));
        System.out.println("   20! = " + MathUtil.getFactorial(20));

        tryTDDFirst();
    }

    public static void tryTDDFirst() {
        //Test case #1
        //n=0 hy vong method tra ve 1
        // thuc te = ????
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("   0! Status:\n\t    Expected = " + expected
                + "  |  Actual = " + actual + "\n");

        //Test case #2
        //n=1 hy vong method tra ve 1
        actual = MathUtil.getFactorial(1);
        System.out.println("   1! Status:\n\t    Expected = " + expected
                + "  |  Actual = " + actual + "\n");

        //Test case #3
        //n=2 hy vong method tra ve 3
        expected = 2;
        actual = MathUtil.getFactorial(2);
        System.out.println("   2! Status:\n\t    Expected = " + expected
                + "  |  Actual = " + actual + "\n");

        //Test case #3
        //n=3 hy vong method tra ve 3
        expected = 6;
        actual = MathUtil.getFactorial(3);
        System.out.println("   3! Status:\n\t    Expected = " + expected
                + "  |  Actual = " + actual + "\n");
    }
}