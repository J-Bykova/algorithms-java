public class Reverser {

    private static void printPermutation(String str, String result) {
        if (str.length() == 1) {
            System.out.print(result + str + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String other = str.substring(0, i) + str.substring(i + 1);

            printPermutation(other, result + ch);


        }

    }

    private static String reverseString(String word) {
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return reverseWord;
    }

    private static String reverseStringUsingArray(String word) {
        char[] arr = word.toCharArray();

        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return new String(arr);
    }

    private static String reverseStringUsingArray2(String word) {
        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char item = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = item;
        }
        return new String(arr);
    }

    private static int[] reverseArray(int[] arr) {
        int[] arrClone = arr.clone();

        for (int i = 0; i < arrClone.length / 2; i++) {
            int temp = arrClone[i];
            arrClone[i] = arrClone[(arrClone.length - 1) - i];
            arrClone[(arrClone.length - 1) - i] = temp;
        }

        return arrClone;
    }

}
