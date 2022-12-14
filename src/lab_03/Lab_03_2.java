package lab_03;

public class Lab_03_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (max <= intArr[i]) {
                max = intArr[i];
            }
            if (min >= intArr[i]){
                min = intArr[i];
            }
        }
        System.out.printf("Max number is %d\n",max);
        System.out.printf("Min number is %d\n",min);
    }
}


