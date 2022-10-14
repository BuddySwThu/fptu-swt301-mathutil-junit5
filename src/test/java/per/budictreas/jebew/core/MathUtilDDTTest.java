package per.budictreas.jebew.core;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Assertions;

public class MathUtilDDTTest {
    //chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hoá data này
    //vào trong câu lệnh kiểm thử

    //chuẩn bị bộ data
    public static Object[][] initData() {
        return new Integer[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }

    @ParameterizedTest
    @MethodSource(value = "initData")
    //tên hàm cung cấp data, ngầm định thứ tự của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        Assertions.assertEquals(MathUtil.getFactorial(input), expected);
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
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }
}
