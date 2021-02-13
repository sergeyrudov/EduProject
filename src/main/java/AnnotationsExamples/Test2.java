package AnnotationsExamples;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("AnnotationsExamples.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xioami class " + sm1.OS() + ", " + sm1.yearOfCompanyFoundation());


        Class appleClass = Class.forName("AnnotationsExamples.Apple");
        Annotation annotation2 = appleClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Apple class " + sm2.OS() + ", " + sm2.yearOfCompanyFoundation());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // lifecycle of annotation
@interface SmartPhone{
    String OS() default "Android";
    int yearOfCompanyFoundation() default 2010;
}

@SmartPhone()
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "iOS", yearOfCompanyFoundation = 1976)
class Apple {
    String model;
    double price;
}
