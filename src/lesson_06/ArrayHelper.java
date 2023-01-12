package lesson_06;

public class ArrayHelper {

    public int findMinNumber(int[] arr) {
        return -1;

    }

    public int findMaxNumber(int[] arr) {
        return -1;
    }
    
    public int[] sort (int[] arr) {
        sortAsc(arr);
        return arr;
    }

    /**
     * @param arr
     * @param sortType asc, desc
     * @return
     */
    public int[] sort (int[] arr, String sortType) {
        if (sortType.equals("asc")){
            sortAsc(arr);
        } else if (sortType.equals("desc")) {
            
        }
        return  arr;
    }

    private void sortAsc(int[] arr) {
    }
}
