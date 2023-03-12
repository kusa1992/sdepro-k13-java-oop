package lesson_12;

public class AndroidDriver extends AppiumDriver {
    @Override
    protected void initDriver() {
        System.out.println("Init AndroidDriver!");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close AndroidDriver");
    }
}
