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
        Integer b = Integer.parseInt(System.getProperty("number"));
        Integer expected = 5 ;

        Assertions.assertEquals(expected, b);
    }
}
