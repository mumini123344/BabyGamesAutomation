package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartingPage {
    public StartingPage(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
}