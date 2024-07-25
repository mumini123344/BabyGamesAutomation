package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.RandomClass;
import utils.TapComposition;

public class HomeSteps {
    WebDriver driver;
    RandomClass randomClass = new RandomClass();
    TapComposition tapComposition = new TapComposition();
    HomePage homePage;

    public HomeSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }


    public HomeSteps tapOnLeftGamesCategory(AndroidDriver driver, int x, int y) throws InterruptedException {
        randomClass.randomMethod();
        tapComposition.action_tapOnPosition(driver, x, y);
        System.out.println("tapOnLeftGamesCategory executed");
        return this;
    }

    public HomeSteps tapOnMiddleGamesCategory(AndroidDriver driver, int x, int y) throws InterruptedException {
        Thread.sleep(4000);
        tapComposition.action_tapOnPosition(driver, x, y);
        System.out.println("tapOnMiddleGamesCategory executed");
        return this;
    }

    public HomeSteps tapOnRightGamesCategory(AndroidDriver driver, int x, int y) throws InterruptedException {
        Thread.sleep(4000);
        tapComposition.action_tapOnPosition(driver, x, y);
        System.out.println("tapOnRightGamesCategory executed");
        return this;
    }

    public HomeSteps tapHomeButton(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        tapComposition.action_tapOnPosition(driver, 80, 70);
        return this;
    }
}
