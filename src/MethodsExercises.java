public class MethodsExercises {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int additionResult = addition(num1, num2);
        int subtractionResult = subtraction(num1, num2);
        int multiplicationResult = multiplication(num1, num2);
        int divisionResult = division(num1, num2);
        int modulusResult = modulus(num1, num2);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Modulus: " + modulusResult);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulus by zero is not allowed.");
            return 0;
        }
        return a % b;
    }
}


