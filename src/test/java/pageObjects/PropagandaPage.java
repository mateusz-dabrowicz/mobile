package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class PropagandaPage extends BasePage {

    public void clickOnArrow(){
        $(By.id("propaganda slide arrow")).shouldBe(Condition.visible).click();
    }

    public void clickOnSignIn(){
        $(By.id("SIGN IN")).click();
    }

    public void textShouldBeVisible(String text){
        $(By.name(text)).shouldHave(Condition.value(text));
    }
}
