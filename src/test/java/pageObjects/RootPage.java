package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class RootPage extends BasePage {

    public void titleShouldBe(String title) {
        $(By.name(title),1).shouldHave(Condition.value(title));
    }
}
