package utils;

import io.appium.java_client.android.AndroidDriver;
import steps.GamesSteps;
import steps.HomeSteps;

public class Helper {
    AndroidDriver driver;
    HomeSteps homeSteps;
    GamesSteps gamesSteps;

    public Helper(AndroidDriver driver, HomeSteps homeSteps, GamesSteps gamesSteps) {
        this.driver = driver;
        this.homeSteps = homeSteps;
        this.gamesSteps = gamesSteps;
    }

    public void tapCategory(String category, int x, int y) throws InterruptedException {
        switch (category) {
            case "Left":
                homeSteps.tapOnLeftGamesCategory(driver, x, y);
                break;
            case "Middle":
                homeSteps.tapOnMiddleGamesCategory(driver, x, y);
                break;
            case "Right":
                homeSteps.tapOnRightGamesCategory(driver, x, y);
                break;
            default:
                break;
        }
    }

    public void interactWithCategories(int[][] coordinates, int iterations) throws InterruptedException {
        String[] categories = {"Left", "Middle", "Right"};
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < categories.length; j++) {
                tapCategory(categories[j], coordinates[j][0], coordinates[j][1]);
                homeSteps.tapHomeButton(driver);
            }
            gamesSteps.swipeRight(driver, 0.8, 0.2);
        }
    }

}
