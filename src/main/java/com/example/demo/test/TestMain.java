package com.example.demo.test;



/**
 * @Author: Hu Xin
 * @Date: 2023/1/14 22:10
 * @Desc:
 **/
public class TestMain {
    public static void main(String[] args) throws Exception {
//        ClassPool pool = ClassPool.getDefault();
//        CtClass messageChannelCC = pool.getCtClass("org.springframework.messaging.MessageChannel");
//        CtClass ctClass = pool.getCtClass("com.example.demo.scsconfig.ParaviewScsProcessor");
//        //增加的方法
//        CtMethod ctMethod = new CtMethod(messageChannelCC, "printName", new CtClass[]{}, ctClass);
//        //获取方法信息和常量池
//        MethodInfo methodInfo = ctMethod.getMethodInfo();
//        ConstPool constPool = methodInfo.getConstPool();
//
//        AnnotationsAttribute methodAnnotation = new AnnotationsAttribute(constPool,AnnotationsAttribute.visibleTag);
//        // 增加的注解
//        Annotation inputAnnotation = new Annotation("org.springframework.cloud.stream.annotation.Input",constPool);
//        inputAnnotation.addMemberValue("value",new StringMemberValue("printName",constPool));
//        //注解增加到方法上
//        methodAnnotation.addAnnotation(inputAnnotation);
//        methodInfo.addAttribute(methodAnnotation);
//
//        ctClass.addMethod(ctMethod);
//        Class<?> aClass = ctClass.toClass();
//        System.out.println(aClass.getClass().getName());
    }
}
