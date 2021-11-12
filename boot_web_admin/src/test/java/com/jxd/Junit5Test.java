package com.jxd;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

/**
 * @author jxd
 * @date 2021/11/12 20:48
 */
//@SpringBootTest
@DisplayName("junit5测试功能类")
public class Junit5Test {

    @DisplayName("测试DisplayName注解")
    @Test
    void testDisplayName(){
        System.out.println("1");
    }

    @Test
    void test2(){
        System.out.println("2");
    }

    @BeforeEach
    void testBeforeEach(){
        System.out.println("测试就要开始了");
    }

    @AfterEach
    void testAfterEach(){
        System.out.println("测试结束了");
    }

    /**
     * 需要设置为static方法，或者将这个类设置@TestInstance(TestInstance.Lifecycle.PER_CLASS)
     */
    @BeforeAll
    static void testBeforeAll(){
        System.out.println("所有测试就要开始了");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("所有测试已经结束了");
    }

    @Disabled
    @DisplayName("测试3")
    void test3(){
        System.out.println("3");
    }

    /**
     * 规定方法的执行时间，超出时间报异常
     * @throws InterruptedException
     */
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testTimeout() throws InterruptedException {
        Thread.sleep(300);
    }

    @RepeatedTest(value = 3)
    void testRepeatedTest(){
        System.out.println("测试RepeatedTest注解");
    }
}
