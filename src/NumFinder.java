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

    private static boolean isPrime(int primeNum) {
        if (primeNum <= 1) {
            return false;
        }
        if (primeNum <= 3) {
            return true;
        }
        if (primeNum % 2 == 0 || primeNum % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= primeNum; i = i + 6) {
            if (primeNum % i == 0 || primeNum % (i + 2) == 0) {
                return false;
            }
        }

        return true;
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

    private static boolean isPrimeNumber(int primeNum) {
        if (primeNum <= 1) {
            return false;
        }

        for (int i = 2; i < primeNum; i++) {
            if (primeNum % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static ArrayList<Integer> findPrimeNumbersInRange(int num) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < num; i++) {
            if (isPrimeNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static ArrayList<Integer> findPrimeNumbersInArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

}
