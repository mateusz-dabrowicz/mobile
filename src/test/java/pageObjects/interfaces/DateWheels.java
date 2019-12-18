package pageObjects.interfaces;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface DateWheels {

    ElementsCollection pickerWheels = $$(By.xpath("//XCUIElementTypePickerWheel"));

    default DateWheels setMonth(String month){
        pickerWheels.first().sendKeys(month);
        return this;
    }

    default DateWheels setDay(String day){
        pickerWheels.get(1).sendKeys(day);
        return this;
    }

    default DateWheels setYear(String year){
        pickerWheels.last().sendKeys(year);
        return this;
    }
}
