import java.util.*;


public class InterviewPrep {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<String> list = new ArrayList<String>();
        list.add("ppp");
        list.add("4");
        list.add("ooo");
        list.add("6");
        String[] strArray = {"234", "sdfs", "5"};

        splitArrByType2(strArray);
    }

    private static void splitArrByType2(String[] arr) {
        List<Integer> intArr = new ArrayList<Integer>();
        List<String> strArr = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            try {
                Integer value = Integer.valueOf(arr[i]);
                intArr.add(value);
            } catch (NumberFormatException ex) {
                strArr.add(arr[i]);
            }
        }
        System.out.println("integer array: " + intArr);
        System.out.println("string array: " + strArr);
    }

    private static void splitArrByType(ArrayList<Object> list) {
        List<Integer> arrNum = new ArrayList<Integer>();
        ArrayList<String> arrString = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof String) {
                arrString.add((String) obj);
            } else if (obj instanceof Integer) {
                arrNum.add((Integer) obj);
            } else {
                throw new Error("Incorrect type");
            }
        }
        System.out.println(arrNum);
        System.out.println(arrString);
    }

    // сумма всех элементов массива
    private static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int some(int[] arr) {
        int i = arr.length;
        return i;
    }

    //  TODO: does not work, rewrite this shit;
    // найти 2 одинаковых числа
    private static int[] filterDups(int[] arr) {
        Set<int[]> set = new HashSet<int[]>();

        int[] result = new int[set.size()];
        int i = 0;
        for (Object num : set) {
            result[i++] = (int) (Integer) num;
        }
        return result;
    }

    //    ???
    private static String printEvens(int num) {
        String result = "";
//		for(int i=0; i < num; i+=2)
//			result += i + " ";
        int i = 0;
        while (i <= num) {
            result += i;
            i += 2;
        }
        return result.trim();
    }

    //    способ из школы...
    private static boolean findPairEfficiently(int[] arr, int sum) {
        HashSet<Integer> ints = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            ints.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (ints.contains(sum - arr[i])) {
                return true;
            }
        }
        return false;
    }


}
