package com.studay.base.data.type;


import org.junit.Test;

/**
 * ----------Integer类学习----------
 *
 * 装箱：将基本数据类型自动转化为对象；
 * 拆箱：将对象重新转化为基本数据类型；
 *
 *
 * Integer缓存范围
 *      [-128,127]
 *
 */
public class IntegerStudyTest {


    @Test
    public void test01(){

        int a1 = 122;
        // jdk1.5之后引入自动装拆箱
        Integer a2 = 122;
        Integer a3 = 122;

        int b1 = 128;
        Integer b2 = 128;
        Integer b3 = 128;

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(b1 == b2);
        // Integer有缓存值 [-127,128]
        System.out.println(b2 == b3);

    }
}
