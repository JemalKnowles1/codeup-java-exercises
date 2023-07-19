package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("John");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(78);
        students.put("john123", student1);

        Student student2 = new Student("Jane");
        student2.addGrade(95);
        student2.addGrade(88);
        student2.addGrade(92);
        students.put("jane456", student2);

        Student student3 = new Student("Alex");
        student3.addGrade(75);
        student3.addGrade(80);
        student3.addGrade(85);
        students.put("alex789", student3);

        Student student4 = new Student("Emily");
        student4.addGrade(89);
        student4.addGrade(92);
        student4.addGrade(87);
        students.put("emily321", student4);

        // Start the command line interface (CLI)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!\n");
        System.out.print("Here are the GitHub usernames of our students:\n\n");
        printStudentUsernames(students);

        boolean run = true;
        while (run) {
            System.out.print("\nWhat student would you like to see more information on? ");
            String input = scanner.next();

            if (students.containsKey(input)) {
                Student student = students.get(input);
                System.out.println("\nName: " + student.getName() + " - GitHub Username: " + input);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".");
            }

            System.out.print("\nWould you like to see another student? (y/n) ");
            String choice = scanner.next();
            run = choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes");
        }

        System.out.println("\nGoodbye, and have a wonderful day!");
    }
    private static void printStudentUsernames(Map<String, Student> students) {
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();
    }
}

