package lab_03;

import java.util.Arrays;

public class Lab_03_4 {

    public static void main(String[] args) {
        int[] firstArr = {1, 12, 16, 28, 34};
        int[] secondArr = {1, 13, 16, 27, 99};
        int firstArrLen = firstArr.length;
        int secondArrLen = secondArr.length;
        int[] result = new int[firstArrLen+secondArrLen];
        System.arraycopy(firstArr,0, result,0,firstArrLen);
        System.arraycopy(secondArr,0, result,firstArrLen,secondArrLen);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}


