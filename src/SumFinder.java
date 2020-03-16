import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumFinder {

    private static boolean findPairInOrderWithSum(int[] arr, int exSum) {
        for (int i = 0; i < arr.length - 1; i++) { // i = 0; пока i меньше индекса последнего элемента arr; i = i + 1
            int sum = arr[i] + arr[i + 1]; // складываем элемент по индексом i  и следующий элемент
            if (sum == exSum) { // если суммы равны то верни true
                return true;
            }
        }
        return false; // если нет, верни false
    }

    private static boolean findAnyPairWithSumUsingSubLoop(int[] arr, int exSum) {
        for (int i = 0; i < arr.length - 1; i++) { // i = 0; пока i меньше индекса последнего элемента arr; i = i + 1
            for (int j = i + 1; j < arr.length; j++) { // j = i + 1; пока i меньше длинны массива arr; j = i + 1
                if (arr[i] + arr[j] == exSum) // складываем i + j и сравнивает с ожидаемым числом,
                    return true; //если они равны то верни true
            }
        }
        return false; //если нет то false
    }

    private static boolean findAnyPairWithSumUsingBidirectionalLoop(int[] arr, int exSum) {
        Arrays.sort(arr);//сортируем масссив

        if ((arr[0] + arr[1]) > exSum) {//если сумма первых двух элементов массисва больше ожидаемой суммы
            return false;//верни false
        }
        if ((arr[arr.length - 1] + arr[arr.length - 2]) < exSum) {//если сумма последних 2 элемнтов меньше ожидаемой
            return false;//верни false
        }
        if ((arr[0] + arr[1]) == exSum || (arr[arr.length - 1] + arr[arr.length - 2]) == exSum) {//если сумма 2 первых или 2 последних элементов == ожидаемой
            return true;//верни true
        }

        int left = 0;//левый элемент == 0
        int right = arr.length - 1;//правый == последнему элементу массива

        while (left < right) {
            if (arr[left] + arr[right] == exSum)
                return true;
            else if (arr[left] + arr[right] < exSum)//если сумма меньше ожидаемой
                left++;//сделай сдвиг в право
            else//если сумма больше ожидаемой
                right--;//сделай сдвиг в лево
        }
        return false;//если все не верно верни false
    }

    private static boolean findPairWithDifference(int[] arr, int exDiff) {
        if (arr.length < 2) {
            return false;
        }
        Set<Integer> nums = new HashSet<Integer>(arr.length);

        for (int num : arr) {
            int diff = exDiff - num;
            if (nums.contains(diff)) {
                return true;
            } else {
                nums.add(num);
            }
        }
        return false;
    }


}
