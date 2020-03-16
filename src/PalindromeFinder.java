
//  Ищет числа/строки одинаковые со всех сторон
public class PalindromeFinder {

    private static boolean isPalindrome(String text) {
        char[] expectedArr = text.toCharArray();
        for (int i = 0; i < expectedArr.length / 2; i++) {
            char temp = expectedArr[i];
            expectedArr[i] = expectedArr[(expectedArr.length - 1) - i];
            expectedArr[(expectedArr.length - 1) - i] = temp;
        }
        if (new String(expectedArr).equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPalindrome(int originalNum) {
        if (originalNum > 2147447412 || originalNum < 0) {
            return false;
        }

        int num = originalNum;
        int reverse = 0;
        int ones;

        while (num > 0) {
            ones = num % 10;
            num = num / 10;
            reverse = reverse * 10 + ones;
        }
        if (reverse == originalNum) {
            return true;
        }
        return false;
    }
}

