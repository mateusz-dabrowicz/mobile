package pageObjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class FolderTreePage extends BasePage{

    public FolderTreePage clickOnElement(String name){
        $(By.name(name))
                .waitUntil(Condition.visible,10000)
                .$(By.name("ItemName"))
                .click();
        return this;
    }

    public FolderTreePage clickOnHamburger(String name){
        $(By.name(name)).$(By.name("notificationOptionsButton")).click();
        return this;
    }
}
