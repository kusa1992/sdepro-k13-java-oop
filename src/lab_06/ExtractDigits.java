package lab_06;

public class ExtractDigits {

    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] myCharacters = myStr.toCharArray();
        for (char myCharacter : myCharacters) {
            if (Character.isDigit(myCharacter)){
                System.out.println(myCharacter);
            }
        }
    }
}
