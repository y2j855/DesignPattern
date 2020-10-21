package com.tony.dp.ASM;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.io.File;
import java.io.FileOutputStream;

import static org.objectweb.asm.Opcodes.ASM4;
import static org.objectweb.asm.Opcodes.INVOKESTATIC;

/**
 * @author: Tony.Chen
 * Create Time : 2020/10/20 21:06
 * Description:
 * ASM模拟JDK动态代理，生成代理源码
 * ASM使用了visitor,chain of responsibility模式
 */
public class ClassTransformerTest {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("com/tony/dp/ASM/Tank.class")
        );
        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
//                return mv;
                return new MethodVisitor(ASM4, mv) {
                    @Override
                    public void visitCode() {
                        if(name.equals("move")) {
                            visitMethodInsn(INVOKESTATIC, "com/tony/dp/ASM/TimeProxy", "before", "()V", false);
                        }
                        super.visitCode();
                    }
                };
            }
        };

        cr.accept(cv, 0);
        byte[] b2 = cw.toByteArray();

        MyClassLoader cl = new MyClassLoader();
        cl.loadClass("com.tony.dp.ASM.Tank");
        Class c2 = cl.defineClass("com.tony.dp.ASM.Tank", b2);
        c2.getConstructor().newInstance();

        String path = (String) System.getProperties().get("user.dir");
        File f = new File(path + "/com/tony/dp/ASM/");
        f.mkdir();

        FileOutputStream fos = new FileOutputStream(new File(path + "/com/tony/dp/ASM/Tank_0.class"));
        fos.write(b2);
        fos.flush();
        fos.close();

    }
}
