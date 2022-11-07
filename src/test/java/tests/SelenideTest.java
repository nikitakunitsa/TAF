package tests;


import baseEntities.BaseTestOld;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest extends BaseTestOld {

    @Test
    public void loginTest() {
        SelenideElement username = $(By.id("name"));
        username.setValue(ReadProperties.username());
        $("#password").setValue(ReadProperties.password());
        $("#button_primary").click();

        $(byText("All Projects")).shouldBe(Condition.visible);
        $(By.xpath("//div[contains(text(), 'All Projects')]")).shouldBe(Condition.visible);

        ElementsCollection list = $$(By.tagName("div"));


    }
}
