import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println((i++) + " ");

        }

        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);

        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        long num = 2;
        do {
            System.out.println(num);
            num *= num;
        } while (num < 1000000);

        for (int j = 1; j < 101; j++) {
            if (j % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(j);

            }
        }
        boolean userWantsContinue;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Give me a number: ");
            int userNum = scan.nextInt();
            System.out.println("number | squared | cubed\n------- | ------- | -----");
            for (int j = 1; j <= userNum; j++) {
                System.out.printf("%-6d | %-7d | %d%n", j, j * j, j * j * j);
            }
            System.out.println("would you likr to enter another number");
            scan.nextLine();
            String userAnswer = scan.nextLine();
            userWantsContinue = userAnswer.equals("yes");
        } while (userWantsContinue);

//        do {
//            System.out.println("Give me a number: ");
//            int userNum = scan.nextInt();
//            if(userNum >= 90) {
//            }
//            System.out.println("would you likr to enter another number");
//            scan.nextLine();
//            String userAnswer = scan.nextLine();
//            userWantsContinue = userAnswer.equals("yes");
//        } while (userWantsContinue);
    }
}


