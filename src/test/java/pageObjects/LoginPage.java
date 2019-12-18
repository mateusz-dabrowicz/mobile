package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class LoginPage extends BasePage {

    public void fillInput(String value){
        $(By.id("login_first_input")).should(Condition.visible).setValue(value);
    }

    public void tapButton(){
        $(By.name("Continue")).click();
    }

    public void logInWithDifferentAccountShouldBeVisible(){
        $(By.name("Log in with a different account")).shouldHave(Condition.visible);
    }
}
