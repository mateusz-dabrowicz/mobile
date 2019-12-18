package pageObjects;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void acceptAlert(){
        Selenide.switchTo().alert().accept();
    }

    public BasePage clickOnElementByName(String elementName) {
        $(By.name(elementName)).click();
        return this;
    }
}
