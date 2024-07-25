package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.StartingPage;
import utils.RandomClass;
import utils.TapComposition;

public class StartingSteps {
    WebDriver driver;
    RandomClass randomClass = new RandomClass();
    TapComposition tapComposition = new TapComposition();
    StartingPage startingPage;

    public StartingSteps(WebDriver driver) {
        this.driver = driver;
        startingPage = new StartingPage(driver);
    }


    public StartingSteps tapClose(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(20000);
        tapComposition.action_tapOnPosition(driver, 1696, 212);
        System.out.println("tapClose executed");
        return this;
    }


    public StartingSteps tapSecondClosse(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        tapComposition.action_tapOnPosition(driver, 1000, 1120);
        System.out.println("tapSecondClose executed");
        return this;
    }
}
