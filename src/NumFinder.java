import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumFinder {
    private static void isDuplicates(int[] numberList) {
        HashMap<Integer, Integer> itemCount = new HashMap<Integer, Integer>();

        for (int i = 0; i < numberList.length; i++) {
            int item = numberList[i];
            if (itemCount.containsKey(item)) {
                itemCount.put(item, itemCount.get(item) + 1);
            } else {
                itemCount.put(item, 1);
            }
        }
        for (Integer k : itemCount.keySet()) {
            if (itemCount.get(k) > 1)
                System.out.println("There '" + itemCount.get(k) + "' of item '" + k + "'");
        }
    }

    private static ArrayList<Integer> findEvenNumbersInArray(int[] arr) {
        ArrayList<Integer> results = new ArrayList<Integer>(0);
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            if (item % 2 == 0) {
                results.add(item);
            }
        }
        return results;
    }

    private static String findEvenNumbersInRange(int num) {
        String result = "";
        for (int i = 0; i < num; i += 2) {
            result += i;
        }
        return result.trim();
    }




}
