import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OneTest {

    String mainPage = "https://www.accenture.com/lv-en";

    @MethodSource("method_source_data.ExternalMethodSourceDataProvider#navigationMenuDataProvider")
    @ParameterizedTest(name = "Main menu testing. Item \"{1}\"")
    void navigationMenuShouldHaveCorrectHeadersTest(int index, String menuItem) {
        step("Open main page", () -> {
            open(mainPage);
        });
        ElementsCollection navigationMenuItems =
        step("Find main menu items", () -> {
            return $("#navigation-menu").$$("div.gh-item")
                    .shouldBe(CollectionCondition.size((5)));
        });
        step("Make sure that a menu item contains the correct text", () -> {
            navigationMenuItems.get(index)
                    .shouldHave(text((menuItem)));
        });
    }

}
