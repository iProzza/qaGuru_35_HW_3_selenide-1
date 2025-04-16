package qaguru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class EnterprisesHoverTests {

    @BeforeAll
    static void setUp() {
//        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void enterprisesHoverTest() {
        open("https://github.com");
        $$("button[class^='HeaderMenu-link']").findBy(text("Solutions")).hover();
        $$("a[class^='HeaderMenu-dropdown-link']").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }

    @Test
    void dragNDropSquareTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Вариант 1
        SelenideElement source = $("#column-a");
        SelenideElement target = $("#column-b");

        Selenide.actions().dragAndDrop(source, target).perform();
        source.shouldHave(text("B"));

        // Вариант 2, но в таком исполнении dragAndDropTo в статусе deprecated
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("A"));
    }

}
