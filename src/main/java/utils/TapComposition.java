package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;

import java.time.Duration;
import java.util.List;

public class TapComposition {

    public AndroidDriver action_tapOnPosition(AndroidDriver driver, int pointA_X, int pointA_Y) {
        PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger");
        org.openqa.selenium.interactions.Sequence tapPosition = new org.openqa.selenium.interactions
                .Sequence(finger, 1);

        tapPosition
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), pointA_X, pointA_Y))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(tapPosition));
        return driver;
    }
}
