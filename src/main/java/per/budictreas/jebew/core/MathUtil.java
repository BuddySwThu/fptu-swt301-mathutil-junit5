package per.budictreas.jebew.core;

public class MathUtil {
    //clone bo thu vien Math Util cua JDK
    //gia lap cac ham cua class Math cua JDK
    //public static final double PI = 3.14159265;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid number 'n' !!! 'n' must be between 0...20");
        if (n == 0 || n == 1) return 1;
        return n * getFactorial(n - 1); //đệ quy!!
    }

    //ki thuat lap trinh kieu moi
    //ki thuat TDD - Test Driven Development
    //viet code cho method va viet code de test code song song voi nhau
    //moi method duoc viet ra phai viet ngay test case
}
