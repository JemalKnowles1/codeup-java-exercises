import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[4];
        //    Must declare that array is a data type
        //    In java arrays are of a fix length

        prices[0] = 9.99;
        prices[1] = 10.99;
        prices[3] = 899.99;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(Arrays.toString(prices));
        String[] beatles = {"Paul", "John", "Ringo", "George"};
//        beatles[4] = "Yoko"; throws an exception
        System.out.println(Arrays.toString(beatles));
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
//        enhanced For OF method
        for(double price : prices){
            System.out.println(price);
            for(String beatle : beatles)
                System.out.printf("A number of beatles is named %s.%n", beatle);
        }
        int[] allTheSame = new int[20];
        allTheSame[0] = 10;
        Arrays.fill(allTheSame, 99);
        System.out.println(Arrays.toString(allTheSame));
//        Copy of an array
        String[] alsoBeatles = Arrays.copyOf(beatles, 4);
        System.out.println(beatles);
        System.out.println(alsoBeatles);
        System.out.println(beatles == alsoBeatles);
        System.out.println(Arrays.equals(beatles, alsoBeatles));
        alsoBeatles = Arrays.copyOf(alsoBeatles, 5);
        alsoBeatles[4] = "Yoko";
        System.out.println(Arrays.toString(alsoBeatles));
        System.out.println(alsoBeatles);

//        Sorting array with java works like in JS
        Arrays.sort(alsoBeatles);
        System.out.println(Arrays.toString(alsoBeatles));


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

    }
}
