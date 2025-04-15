package qaguru;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionsTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://github.com/selenide/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void junit5SoftAssertsExampleTest() {
        open("/selenide");
        $("#wiki-tab").click();
        $("li.Box-row.wiki-more-pages-link button").hover().click();
        $$("ul[data-filterable-for='wiki-pages-filter']").shouldHave(CollectionCondition.texts("SoftAssertions"));
        $$("a[href='/selenide/selenide/wiki/SoftAssertions']").filterBy(text("SoftAssertions")).first().click();
        $$("div .overflow-auto").filterBy(text("""
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");
                
                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }""")).shouldHave(sizeGreaterThan(0));
    }
}
