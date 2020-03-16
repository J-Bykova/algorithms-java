public class Swapper {

    private static int swapNums(int a, int b) {


//        a=a+b-(b=a);

//        a = a + b;
//        b = b - a;
//        b = -b;
//        a = a - b;

        a = b + a;
        b = a - b;
        a = a - b;

        return a;
    }

    private static String swapWords(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            result = word + " " + result;
        }
        return result.trim();
    }

    private static String swapWordsUsingArray(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result = word + " " + result;
        }
        return result.trim();
    }


}

