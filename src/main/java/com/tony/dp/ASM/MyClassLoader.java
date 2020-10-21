package com.tony.dp.ASM;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 20:54
 * Description:
 * 自定义的ClassLoader
 */
public class MyClassLoader extends ClassLoader{
    public Class defineClass(String name,byte[] b){
        return defineClass(name,b,0,b.length);
    }
}
