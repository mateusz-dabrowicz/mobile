package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import webdriver.IOSDriverProvider;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void setUp() {
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.browser = IOSDriverProvider.class.getName();
        open();
    }

    @After
    public void tearDown() {
      closeWebDriver();
    }
}
