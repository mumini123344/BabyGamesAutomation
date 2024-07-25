package utils;

import java.util.Random;

public class RandomClass {

    Random random = new Random();

    public int randomMethod() {
        return random.nextInt(1500, 10000);
    }

    public int randomMethodForScroll() {
        return random.nextInt(2000, 10000);
    }

}
