package PersonExercises;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int num;
        do {
            System.out.print("Please enter an integer between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < min || num > max);

        scanner.nextLine(); // Consume the newline character left by nextInt()
        return num;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double num;
        do {
            System.out.print("Please enter a decimal number between " + min + " and " + max + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a decimal number: ");
                scanner.next();
            }
            num = scanner.nextDouble();
        } while (num < min || num > max);

        scanner.nextLine(); // Consume the newline character left by nextDouble()
        return num;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
