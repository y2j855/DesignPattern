package com.tony.dp.flyweight;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/17 20:51
 * Description:
 * java中将String类定义为final，JVM中字符串一般保存在字符串常量池中，
 * java会确保一个字符串在常量池中只有一个拷贝，
 * 这个字符串常量池在JDK6.0以前是位于常量池中，位于永久代，而在JDK7.0中，
 * JVM将其从永久代拿出来放置于堆中
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7+s8;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s9);
        System.out.println(s4==s5);
        System.out.println(s1==s6);
    }
}
