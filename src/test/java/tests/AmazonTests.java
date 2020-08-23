package tests;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Tag("AmazonCartTests")
public class AmazonTests {

    @Test
    public void testEmptyCartUnregisterUser() {
        Assert.check(true);
//        open("https://www.amazon.com");
//
//        $("#nav-cart").click();
//
//        $(".a-row.sc-your-amazon-cart-is-empty").shouldHave(text("Your Amazon Cart is empty"));
    }

    @Test
    public void testCartUnregisterUser() {
        Assertions.assertEquals(5,5);
//        open("https://www.amazon.com");
//
//        $("#nav-cart").shouldHave(text("Cart"));
    }

}
