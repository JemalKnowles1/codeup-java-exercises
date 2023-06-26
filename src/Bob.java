import java.util.Scanner;


public class Bob {
        public static void main(String[] args) {
            // Example 1
            String output1 = "We don't need no education\nWe don't need no thought control";
            System.out.println(output1);

            // Example 2
            String output2 = "Check \"this\" out!, \"s inside of \"s!";
            System.out.println(output2);

            // Example 3
            String output3 = "In windows, the main drive is usually C:\\";
            System.out.println(output3);

            // Example 4
            String output4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash\\\\\\!";
            System.out.println(output4);

                Scanner scanner = new Scanner(System.in);
                String input;

                do {
                    System.out.print("You: ");
                    input = scanner.nextLine().trim();

                    if (input.isEmpty()) {
                        System.out.println("Bob: Fine. Be that way!");
                    } else if (input.endsWith("?")) {
                        System.out.println("Bob: Sure.");
                    } else if (input.endsWith("!")) {
                        System.out.println("Bob: Whoa, chill out!");
                    } else {
                        System.out.println("Bob: Whatever.");
                    }
                } while (!input.equalsIgnoreCase("bye"));

                scanner.close();
        }
    }


