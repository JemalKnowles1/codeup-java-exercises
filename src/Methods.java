import java.util.Scanner;

public class Methods {
    public static final Scanner scanner = new Scanner(System.in);
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(int numberOfGreetings) {
        for (int i = 0; i < numberOfGreetings; i++) {
            System.out.println(sayHello());
        }
    }

    public static String sayHello() {
        return sayHello("World");
    }
public static void login(Scanner scanner, int attemptsleft){
        if(attemptsleft == 0)
    System.out.println("Please enter your username");
    String username = scanner.nextLine();
    System.out.println("Enter your password");
    String password = scanner.nextLine();
    if(username.equalsIgnoreCase("admin") && password.equals("Password")) {
        System.out.println("welcome to the internet");
    }else{
        System.out.println("Invalid");
        login(scanner, attemptsleft -1);
    }

}
public static long raiseToPower(int base, int exponent) {
    if (exponent <= 0) {
        return 1;
    } else if (exponent == 1) {
        return base;
    } else {
        return base * raiseToPower(base, exponent - 1);
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is my Name?");
//        String name = scanner.nextLine();
//
//        System.out.println(sayHello(name));
//        System.out.println(sayHello("Kofi"));
//        System.out.println(sayHello());
//        System.out.println(3);
        login(scanner, 5);
    }
}
