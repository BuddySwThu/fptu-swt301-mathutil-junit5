package per.budictreas.jebew.core;

public class MathUtil {
    //clone bo thu vien Math Util cua JDK
    //gia lap cac ham cua class Math cua JDK
    //public static final double PI = 3.14159265;

    //ham tinh n! = 1.2.3...n
    //Quy uoc:
    //ko co giai thua cho so am
    //0! = 1! = 1
    //21! vuot 18 so 0, vuot kieu long
    //chi chap nhan tinh giai thua cua n tu 0...20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid number 'n' !!! 'n' must be between 0...20");
        if (n == 0 || n == 1) return 1;
        return n * getFactorial(n - 1); //đệ quy!!!

        //long product = 1;
        //acc - accumulation, gop dan
        //for (int i = 2; i <= n; i++) product *= i;
        //return product;
    }

    //ki thuat lap trinh kieu moi
    //ki thuat TDD - Test Driven Development
    //viet code cho method va viet code de test code song song voi nhau
    //moi method duoc viet ra phai viet ngay test case
}
