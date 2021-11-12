package com.jxd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jxd
 * @date 2021/11/12 21:09
 */
@DisplayName("测试断言机制")
public class TestAssert {

    @Test
    @DisplayName("测试简单断言")
    void testSimpleAssertions(){
        int calculate = calculate(1, 1);
        assertEquals(2, calculate, "计算错误");
    }

    int calculate(int i, int j){
        return i + j;
    }

    @Test
    void testAssertSame(){
        //判断对象和预期对象是否是同一个对象
        Object obj = new Object();
        Object obj1 = new Object();
        assertSame(obj, obj,"两个对象不是同一个对象");
    }

    @Test
    @DisplayName("array assertion")
    void testArrayAssertion(){
        assertArrayEquals(new int[]{1, 2}, new int[]{3, 4});
    }

    @Test
    @DisplayName("组合断言")
    void testAssertAll(){
        assertAll("test",
                  ()-> assertTrue(true && true),
                  ()-> assertEquals(true, true));
    }

    @Test
    @DisplayName("异常断言")
    void testException(){
        assertThrows(ArithmeticException.class,
                ()->{
                    int i = 10 / 0;
                }, "出现数学运算异常"
        );
    }
}
