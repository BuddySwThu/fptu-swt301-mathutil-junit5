package per.budictreas.jebew.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author giao.lang
 */
public class MathUtilTest {
    //ki thuat lap trinh kieu moi
    //ki thuat TDD - Test Driven Development
    //viet code cho method va viet code de test code song song voi nhau
    //moi method duoc viet ra phai viet ngay test case

    @Test
    public void tryJUnitFirst() {
        Assertions.assertEquals(69, 69);
    }

    // ten ham Test bao ham luon y nghia test cai gi
    //quy uoc dan testing
    //tuan thu coding convention
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        //Test case #1: kiem thu tinh huong 0!
        //n=0, hy vong ham tra ve expected=1, actual=?
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell2() {
        //Test case #2: kiem thu tinh huong 1!
        //n=1, hy vong ham tra ve expected=1, actual=?
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell3() {
        //Test case #3: kiem thu tinh huong 2!
        //n=2, hy vong ham tra ve expected=1, actual=?
        long expected = 2;
        long actual = MathUtil.getFactorial(2);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell4() {
        //Test case #4: kiem thu tinh huong 3!
        //n=3, hy vong ham tra ve expected=1, actual=?
        long expected = 6;
        long actual = MathUtil.getFactorial(3);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell5() {
        //Test case #5: kiem thu tinh huong 4!
        //n=4, hy vong ham tra ve expected=1, actual=?
        long expected = 24;
        long actual = MathUtil.getFactorial(4);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell6() {
        //Test case #6: kiem thu tinh huong 5!
        //n=5, hy vong ham tra ve expected=1, actual=?
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnWell7() {
        //Test case #7: kiem thu tinh huong 6!
        //n=6, hy vong ham tra ve expected=1, actual=?
        long expected = 720;
        long actual = MathUtil.getFactorial(6);
        //so sanh 2 gia tri co tuong dong??
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //@SuppressWarnings("ResultOfMethodCallIgnored")
    public void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #8: kiem thu tinh huong -5!
        //n=-5, hy vong ham quang loi
        //long result = MathUtil.getFactorial(-5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }
}
