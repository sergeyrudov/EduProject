package someCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.stream.Stream;

public class TestNGFunctionalDataProviderExample {



    @DataProvider(name = "testData")
    public Iterator<Object[]> provideTestData() {
        return TestDataUtils.generateTestData().iterator();
    }

    @Test(dataProvider = "testData")
    public void testWithData(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



class TestDataUtils {
    @DataProvider(name = "testData")
    public static Iterable<Object[]> generateTestData() {
        return () -> {
            return Stream.of(
                    new Object[]{"Alice", 25},
                    new Object[]{"Bob", 30},
                    new Object[]{"Charlie", 28}
            ).iterator();
        };
    }
}