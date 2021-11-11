package FunctionalInterface;

public interface Operation<T> {
    T getResult(T value1, T value2);
}

interface TestInt extends Operation<String> {
    void vv();
}

interface Kek extends Operation<String>, TestInt{
    void vv1();

    @Override
    String getResult(String value1, String value2);
}