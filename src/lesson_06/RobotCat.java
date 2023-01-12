package lesson_06;

public class RobotCat {

    // Class field: chua Attribute của object duoc sinh ra. RobotCat co attribute la name
    private String name;
    private String year;
    private String color;

    public RobotCat() {
    }

    public RobotCat(String name, String year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
