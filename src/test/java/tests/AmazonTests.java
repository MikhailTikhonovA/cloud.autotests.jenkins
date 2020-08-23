package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("AmazonCartTests")
public class AmazonTests {

    @Test
    public void simpleTest() {
        Assertions.assertEquals(5, 5);
    }

    @Test
    public void parametrizedStringTest() {
        String b = System.getProperty("apple");
        String expected = "apple";

        Assertions.assertEquals(expected, b);
    }

    @Test
    public void parametrizedIntTest() {
        Double b = Double.parseDouble(System.getProperty("number"));
        Double expected = 5.0;

        Assertions.assertEquals(expected, b);
    }
}
