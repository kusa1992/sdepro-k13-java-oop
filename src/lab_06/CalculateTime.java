package lab_06;

import java.util.Arrays;

public class CalculateTime {

    public static void main(String[] args) {
        int firstTime = 0;
        int secondTime = 0;
        String myTime = "2hrs and 5 minutes";
        String[] timeItems = myTime.split("and");
        System.out.println(Arrays.toString(timeItems));

        for (String timeItem : timeItems) {
            if (timeItem.contains("hrs")) {
                String firstTimeItem = timeItem.replaceAll("[^0-9]","");
                firstTime = Integer.valueOf(firstTimeItem) * 60;
            } else {
                String secondTimeItem = timeItem.replaceAll("[^0-9]","");
                secondTime = Integer.valueOf(secondTimeItem);
            }
        }
        System.out.println("The minutes in total is " + (firstTime + secondTime));
    }
}

