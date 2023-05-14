package AnnotationsExamples;

public class AnnotationCheck extends ReadAnnotations {

    public static void main(String[] args) {
        readAnnotations();
        myMethod();
    }

    @CalculateNums(firstNum = 2, secondNum = 5)
    public static void myMethod() {
        System.out.printf("Hello, data from annotation reader is, %s and %s%n", value1, value2);
    }

}
