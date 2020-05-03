import java.util.ArrayList;

public class PrimeNumber {
    private static boolean isPrimeNumber(int primeNum) {
        if (primeNum <= 1) { //потому что все что <= 1 не простое число
            return false;
        }

        for (int i = 2; i < primeNum; i++) { //первое простое число это 2, если просто число 2 то он выйдет из цикла
            if (primeNum % i == 0) { //если предпологаемое число число делитьс на i без отстатка и не равно i
                return false; // то это не просто е число, поэтому вернет false
            }
        }

        return true; //иначе true
    }

    private static boolean isPrime(int primeNum) {
        if (primeNum <= 1) {
            return false;
        }
        if (primeNum <= 3) { // если 2 или 3 вернуть true
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


    private static ArrayList<Integer> findPrimeNumbersInArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
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
}
