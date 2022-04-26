package com.studay.base.static_test;

/**
 * ----------static加载顺序学习----------
 *
 * static作用范围
 *      类: 不需要创建就可以直接调用
 *      方法: 不需要创建对象就可以执行
 *      代码款: 在类加载的时候只会执行一次
 *      变量: 可以作为全局变量
 * 初始化加载顺序
 *      父类静态成员变量，父类静态代码块，子类静态成员变量，子类静态代码块，父类非静态成员变量，父类非静态代码块，父类构造函数，子类非静态成员变量，子类非静态代码块，子类构造函数
 *
 */
public class StaticStudyTest {

    static int a = 0;


    class StaticSonStudyTest{


    }

}
