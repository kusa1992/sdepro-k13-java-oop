package lab_07_2;

import java.security.SecureRandom;

public class Animal {

    private String name;
    protected int randomSpeed;
    final int MAX_SPEED = 75;

    public int getSpeed() {
        return randomSpeed = new SecureRandom().nextInt(MAX_SPEED) ;
    }

}
