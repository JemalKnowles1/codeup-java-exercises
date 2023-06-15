import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleIOE {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        double userInput = k.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//
//        // Prompt the user to enter three words
//        System.out.println("Enter three words: ");
//        String word1 = k.next();
//
////                System.out.println("Enter the second word: ");
//        String word2 = k.next();
//
////                System.out.println("Enter the third word: ");
//        String word3 = k.next();
//
//        // Display the words on separate lines
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//
//        System.out.println("Enter a sentence: ");
//        String sentence = k.nextLine();
//        System.out.println("You entered: --> \"" + sentence + "\" <--");

        System.out.println("Enter the length of the classroom: ");
        double length = Double.parseDouble(k.nextLine());

        System.out.println("Enter the width of the classroom: ");
        double width = Double.parseDouble(k.nextLine());

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);
    }
}

