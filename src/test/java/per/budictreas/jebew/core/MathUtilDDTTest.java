package per.budictreas.jebew.core;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilDDTTest {
    //DDT - Data Driven Testing
    //Tach bo data o tren (expected - actual) gom vao 1 cho
    //fill bo data tuan tu vao cho kiem thu sau
    //ki thuat tach code test ra khoi data duoc goi la ki thuat viet test case theo kieu tham so hoa PARAMETERIZED

    //chuẩn bị bộ data
    public static Object[][] initData() {
        return new Integer[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }

    @ParameterizedTest
    @MethodSource(value = "initData")
    //tên hàm cung cấp data, ngầm định thứ tự của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(MathUtil.getFactorial(input), expected);
    }

//    @Test
//    public void testGetFactorialGivenRightArgReturnsWell() {
//        assertEquals(120, getFactorial(5));
//    }

    //Bắt ngoại lệ khi đưa data cà chớn!!!
    @Test
    //@SuppressWarnings("ResultOfMethodCallIgnored")
    public void testGetFactorialGivenWrongArgThrowException() {
        //xài biểu thức Lambda
        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cái
        //functional interface tên là Executable - có 1 hàm duy nhất ko code
        //tên là execute()
        //chơi chậm

        //Executable exObject = () -> MathUtil.getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }
}
