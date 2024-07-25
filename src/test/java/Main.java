import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.GamesSteps;
import steps.HomeSteps;
import steps.StartingSteps;
import utils.Helper;
import utils.Setup;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Main {

    AndroidDriver driver;
    Setup setup = new Setup();
    StartingSteps startingSteps;
    HomeSteps homeSteps;
    GamesSteps gamesSteps;
    Helper helper;


    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        driver = setup.initializeDriver("com.happytools.learning.kids.games",
                "com.unity3d.player.UnityPlayerActivity");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        startingSteps = new StartingSteps(driver);
        homeSteps = new HomeSteps(driver);
        gamesSteps = new GamesSteps(driver);
        helper = new Helper(driver, homeSteps, gamesSteps);

    }

    @Test(priority = 1)
    public void FirstTwoPage() throws InterruptedException {
        startingSteps.tapClose(driver)
                .tapSecondClosse(driver);

        gamesSteps.swipeLeft(driver, 0.2, 1);
        helper.interactWithCategories(new int[][]{{260, 700}, {1050, 806}, {1805, 757}}, 2);


    }

    @Test(priority = 2)
    public void OtherPages() throws InterruptedException {
        helper.interactWithCategories(new int[][]{{260, 700}, {669, 801}, {1207, 711}}, 3);


    }
}
