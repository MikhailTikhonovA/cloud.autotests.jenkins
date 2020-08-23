package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@Tag("AmazonCartTests")
public class AmazonTests {

    @Tag("UserAmazonCartTest")
    @Test
    public void testEmptyCartUnregisterUser() {
        open("https://www.amazon.com");

        $("#nav-cart").click();

        $(".a-row.sc-your-amazon-cart-is-empty").shouldHave(text("Your Amazon Cart is empty"));
    }

    @Tag("AmazonCartTest")
    @Test
    public void testCartUnregisterUser() {
        open("https://www.amazon.com");

        $("#nav-cart").shouldHave(text("Cart"));
    }

}
