public class CharTreeBuilder {

    public static void makeNumsTree(int height) {
        for (int i = 0; i < height; i++) {
            String result = "";
            for (int j = 0; j <= i; j++) {
                result += j;
            }
            System.out.println(result);
        }
    }

    //   does not work correctly
    public static void makeNumTree(int height) {
        int ornament = 1;
        for (int i = ornament; i < height; i++) {

            for (int j = height - i; j > 0; j--)
                System.out.print(" ");

            for (int k = 1; k <= i; k++)
                System.out.print(ornament + " ");

            System.out.println("");
        }

    }

    public static void makeXmasTree(int height, char ornament, char treeTrunk) {
        for (int i = 1; i < height; i++) {

            for (int j = height - i; j > 0; j--)
                System.out.print(" ");

            for (int k = 1; k <= i; k++)
                System.out.print(ornament + " ");

            System.out.println("");
        }
        int trunkWidth = height;
        if (height % 2 == 0)
            trunkWidth = height + 1;

        for (int l = 0; l < 2; l++) {
            for (int z = 1; z < (trunkWidth - 1) / 2; z++)
                System.out.print(" ");
            for (int w = 0; w < trunkWidth; w++)
                System.out.print(treeTrunk);
            System.out.println("");
        }


    }

    public static void makeXmasTree(int height, char ornament) {
        for (int i = 0; i < height; i++) {

            for (int j = height - i; j > 0; j--)
                System.out.print(" ");

            for (int k = 1; k <= i; k++)
                System.out.print(ornament + " ");

            System.out.println("");
        }

    }

}

