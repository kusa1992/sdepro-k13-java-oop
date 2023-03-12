package lab_07_2;

import java.util.Arrays;
import java.util.List;

public class RacingCompetition extends AnimalController {

    public static void main(String[] args) {
        RacingCompetition racingCompetition = new RacingCompetition();
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        racingCompetition.speedCompare(Arrays.asList(dog, horse, tiger));
    }
}
