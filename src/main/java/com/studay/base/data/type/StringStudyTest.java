package com.studay.base.data.type;

import org.junit.Test;

/**
 *
 * ----------String类学习----------
 *
 * 数据结构
 *      String底层是字符数组来维护 存储String数据也不一定从数组的第0个元素开始的，而是从offset所指的元素开始。
 *
 * String为什么是final
 *      可以实现多个变量引用堆内存中的同一个字符串实例，避免创建的开销。
 *      我们的程序中大量使用了String字符串，有可能是出于安全性考虑。
 *      大家都知道HashMap中key为String类型，如果可变将变的多么可怕。
 *      当我们在传参的时候，使用不可变类不需要去考虑谁可能会修改其内部的值，如果使用可变类的话，可能需要每次记得重新拷贝出里面的值，性能会有一定的损失。
 *
 * 亨元模式
 *      一个系统中如果有多处用到了相同的一个元素，那么我们应该只存储一份此元素，而让所有地方都引用这一个元素
 *      Java中String部分就是根据享元模式设计的，而那个存储元素的地方就叫做“字符串常量池 - String Pool”
 *
 * 相关文章
 *      https://www.cnblogs.com/zhangyinhua/p/7689974.html
 */
public class StringStudyTest {

    @Test
    public void test01(){

        // 直接赋值的方式
        // 只开辟一块堆内存空间，并且会自动入池，不会产生垃圾。
        String a1 = "qwe";

        // 实例化的方式
        // 会开辟两块堆内存空间，其中一块堆内存会变成垃圾被系统回收，而且不能够自动入池 需要通过public  String intern();方法进行手工入池。
        String a2 = new String("qwe");

        // false a1的创建方式是常量池 a2则是堆
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        // ==在对字符串比较的时候，对比的是内存地址，而equals比较的是字符串内容，在开发的过程中，equals()通过接受参数，可以避免空指向。

    }
}
