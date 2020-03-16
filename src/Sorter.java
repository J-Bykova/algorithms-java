public class Sorter {

    private static int[] bubbleSort(int[] arr) {
        int arrLength = arr.length;
        int term = 0;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 1; j < arrLength - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    term = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = term;
                }
            }
        }
        return arr;
    }
}