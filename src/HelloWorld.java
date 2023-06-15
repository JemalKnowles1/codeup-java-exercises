public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber = 7;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        String myString = "Hello, World!";
        System.out.println("myString value: " + myString);

        // Assigning a character value to myString
        myString = "A";
        System.out.println("myString value: " + myString);

        // Assigning 3.14159 to myString
        // This will result in a compilation error
        // because myString is declared as a String, and 3.14159 is a double, not a string value.
        // We cannot assign a double value directly to a String variable.
        // To fix this, we can either change myString to a double variable or convert the double to a string.

        // Declaring a long variable named myNumber
//        long myNumber;
        // Trying to print myNumber without assigning a value
        // This will result in a compilation error
        // because local variables in Java must be initialized before they can be used.

        // Assigning 3.14 to myNumber
        // This will result in a compilation error
        // because 3.14 is a double literal and cannot be directly assigned to a long variable.


        // Assigning the value 3.14 to a variable declared as long does not compile
        // because long variables can only hold integer values, not decimal values.
        // In Java, long is an integer type, and 3.14 is a floating-point literal (double).

        // Changing myNumber to float and assigning 3.14 to it
        float myNumber = 3.14f;
        System.out.println("myNumber value: " + myNumber);
        // Alternatively, we could also use a typecast:
        // float myNumber = (float) 3.14;

        // Execute the code blocks below
//        int a = 5;
//        int b = 2;
//        int c = a + b;
//        System.out.println("The value of c is: " + c);
//
//        int x = 10;
//        int y = 4;
//        int z = x / y;
//        System.out.println("The value of z is: " + z);
//
//        int t = 5;
//        System.out.println(++t);
//        System.out.println(t);

//        class will provide a compile error because class is a reserved keyword


//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println("three = " + three);

        int x = 4;
         x += 5;
         System.out.println("x = " + x);
//        int x = 3;
//        int y = 4;
//        y *= x;
//        int x = 10;
//        int y = 2;
//        x = x /= y;
//        y = y - x;

        byte mybyte = 127;
        System.out.println("mybyte = " + mybyte);

        mybyte++;
        System.out.println("mybyte = " + mybyte);




    }
}
//Note: When copying and pasting the code blocks, make sure to remove the duplicate declaration of myNumber in the float example to avoid a compilation error.



