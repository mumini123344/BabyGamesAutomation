package steps;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebDriver;
import pages.GamesPage;
import pages.HomePage;
import utils.RandomClass;
import utils.Swipe;
import utils.TapComposition;

public class GamesSteps {
    WebDriver driver;
    RandomClass randomClass = new RandomClass();
    TapComposition tapComposition = new TapComposition();
    GamesPage gamesPage;
    Swipe swipe = new Swipe();

    public GamesSteps(WebDriver driver) {
        this.driver = driver;
        gamesPage = new GamesPage(driver);
    }


    public GamesSteps tapOnDuckGame(AndroidDriver driver, int x, int y) throws InterruptedException {
//        randomClass.randomMethod();
        Thread.sleep(5000);
        tapComposition.action_tapOnPosition(driver, x, y);
        System.out.println("tapOnDuckGame executed");
        return this;

    }


    public GamesSteps swipeLeft(AndroidDriver driver, double x, double y) throws InterruptedException {
        Thread.sleep(randomClass.randomMethodForScroll());// 0.2, 1
        swipe.swipeHorizontal(driver, x, y);
        return this;
    }


    public GamesSteps swipeRight(AndroidDriver driver, double x, double y) throws InterruptedException {
        Thread.sleep(randomClass.randomMethodForScroll());// 0.8, 0.2
        swipe.swipeHorizontal(driver, x, y);
        return this;
    }


}
