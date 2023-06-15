import java.util.Scanner;


public class ConsoleIO {
    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.println(name);
//        System.out.print(name);
//        System.out.print(name);
//        System.out.print(name);

//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);


//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

        Scanner s = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = s.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }
}
