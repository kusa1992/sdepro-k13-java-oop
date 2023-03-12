package lab_07_2;

import java.util.List;

public class AnimalController {

    public void speedCompare(List<Animal> animalList){
        int maxSpeed = animalList.get(0).getSpeed();
        String animalName = animalList.get(0).getClass().getSimpleName();
        for (int index = 0; index < animalList.size(); index++) {
            if (maxSpeed <= animalList.get(index).getSpeed()){
                maxSpeed = animalList.get(index).getSpeed();
                animalName = animalList.get(index).getClass().getSimpleName();
            }
        }
        System.out.println("Winner is " + animalName +  ", with speed: " + maxSpeed + "km/h");
    }
}
