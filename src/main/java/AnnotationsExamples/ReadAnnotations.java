package AnnotationsExamples;

import java.lang.reflect.Method;

public abstract class ReadAnnotations {
    protected static int value1;
    protected static int value2;

    static void readAnnotations() {
        AnnotationCheck obj = new AnnotationCheck();
        Method method;
        try {
            method = obj.getClass().getMethod("myMethod");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        CalculateNums annotation = method.getAnnotation(CalculateNums.class);
        value1 = annotation.firstNum();
        value2 = annotation.secondNum();
    }
}
