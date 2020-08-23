package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("AmazonCartTests")
public class AmazonTests {

    @Test
    public void simpleTest() {
        assertEquals(5, 5);
    }

    @Test
    public void parametrizedStringTest() {
        String b = System.getProperty("apple");
        String expected = "apple";

        assertEquals(expected, b);
    }

    @Test
    public void parametrizedIntTest() {
        Double b = Double.parseDouble(System.getProperty("number"));
        Double expected = 5.0;

        assertEquals(expected, b);
    }
}
