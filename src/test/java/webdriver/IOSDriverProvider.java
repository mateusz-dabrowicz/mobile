package webdriver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability(MobileCapabilityType.VERSION, "4.4.2");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "13.2");
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app", "/Users/mdabrowicz/Desktop/a/Egnyte.app");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("udid", "114511E0-417B-4123-83AD-802C7583E0DD");

        try {
            return new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
