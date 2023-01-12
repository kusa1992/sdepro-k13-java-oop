package lesson_05;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {
        String myName1 = "Thao"; // Literal declaration, Refer to Java Pool
        String myName2 = "Thao"; // Literal declaration, Refer to Java Pool
        String myName3 = new String("Thao"); // Via String object, refer to Java Heap

        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        // Check lower case, upper case, digit...
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalUpperCase = 0;
        int totalLowerCase = 0;

        for (char character : myCharacters) {
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isUpperCase(character)) totalUpperCase++;
            else if (Character.isLowerCase(character)) totalLowerCase++;
        }

        if (totalDigits > 0 && totalLowerCase > 0 && totalUpperCase >0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password  format is wrong!");
        }

        // Replacement | Immutable: Giong final nhung cho tao vung nho o duoi, co cai gi dung lai
        String badWordContainer = "bad, very bad, something else, bad      ";
        String filterStr = badWordContainer.replace("bad" , "b**");
        System.out.println(badWordContainer);
        System.out.println(filterStr);

        // Trim
        System.out.println(badWordContainer);
        System.out.println(badWordContainer.trim());

        // IndexOf: tra ve so nguyen
        String url = "https://google.com";
        System.out.println(url.length());
        System.out.println(url.indexOf("s"));
        System.out.println(url.indexOf("https"));

        // Substring
        System.out.println(url.substring(0, 3));
        System.out.println(url.substring(2, url.length()));
        System.out.println(url.substring(2));

        // Split
        String[] splitStr = url.split("://");
        System.out.println(Arrays.toString(splitStr));

        // Regex | Regular Expression
        String myCookingTimes = "    105 mins     ";

        // TODO: Pattern and Matcher

        // ^ trong Regex giong voi !=
        String cookingTimeNumStr = myCookingTimes.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

        int cookingTime = Integer.valueOf(cookingTimeNumStr);
        // Chuyen tat ca cac element thanh string chu khong tinh toan, noi chuoi lai (concatenation), phai bo ngoac de tinh toan
        System.out.println("Cooking time is: " + cookingTime + 1);
        System.out.println("Cooking time is: " + (cookingTime + 1));

        // Concatenation
        String s1 = "Hello, ";
        String s2 = "Thao";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        // StringBuilder: giup toi uu hoa viec xu ly string
    }
}
