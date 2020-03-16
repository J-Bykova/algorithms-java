
public class BiggestNumFinder {

    private static void find2TopNums(int[] arr) {
        int firstTopNum = 0;
        int secondTopNum = 0;

        for (int item : arr) {
            if (item > firstTopNum) {
                secondTopNum = firstTopNum;
                firstTopNum = item;
            } else if (item > secondTopNum) {
                secondTopNum = item;
            }
        }
        System.out.println("The top number is '" + firstTopNum
                + "' and the second top number is '" + secondTopNum + "'");
    }

    private static int findTop(int[] arr) {
        int top = 0;

        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (item > top) {
                top = item;
            }
        }
        return top;
    }
}
