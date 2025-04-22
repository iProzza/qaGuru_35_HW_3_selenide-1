package qaguru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Открытие страницы Enterprize")
    void enterprisesHoverTest() {
        open("https://github.com");
        $$("button[class^='HeaderMenu-link']").findBy(text("Solutions")).hover();
        $$("a[class^='HeaderMenu-dropdown-link']").findBy(text("Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }

    @Test
    @DisplayName("Перемещение элементов с помощью actions()")
    void moveElementByActionsTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));

        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();

        $("#column-a").shouldHave(text("B"));

    }

    @Test
    @DisplayName("Перемещение элементов с помощью dragAndDrop()")
    void moveElementByDragBDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));

//        $("#column-a").dragAndDrop($("#column-b")); // Ошибка приведения типов данных

        $("#column-a").shouldHave(text("B"));
    }

}
