import java.util.Scanner;

public class StringLec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("type abc");
//        String userString = scanner.nextLine();
//        String str ="abc";
//        String str2 = "abc";
//        String newStr = str + "def";
//        System.out.println("abc" == "abc");
//        System.out.println("abc" == str);
//        System.out.println(str == str2);
//        System.out.println(str == userString); // prints false
//        System.out.println(str.equals(userString)); // prints true and is the preferred method of comparing strings
//        System.out.println(newStr == "abcdef"); // prints true
//
//        String jeff = "jeff";
//        String loudJeff = "JEFF";
//
//        System.out.println(jeff.equals(loudJeff)); // prints false
//        System.out.println(jeff.equalsIgnoreCase(loudJeff)); // prints true
//
//        String startsWith8 = "bob";
//        String alsoStartsWith8 = "barbarian";
//        System.out.println(startsWith8.startsWith("b"));
//        System.out.println(alsoStartsWith8.startsWith("B"));
//
        //String METHOD RUNDOWN
        //CharAt
        String cosmos = "COSMOS";
        char thirdIndex = cosmos.charAt(3);
        System.out.println(thirdIndex);

        //indexOf
        String mo = "MO";
        String moe = "MOE";
        System.out.println(cosmos.indexOf(thirdIndex));
        System.out.println(cosmos.indexOf(mo));
        System.out.println(cosmos.indexOf(moe));

        //length
        System.out.println(cosmos.length());

        // replacement
        String kofi = "Kofi the Leo";
        System.out.println(kofi.replace("the Leo", "Knowles"));
        System.out.println(kofi);

        // substring
        String animal = kofi.substring(10);
        String article = kofi.substring(6, 10);
        System.out.println(animal);
        System.out.println(article);

        // trim
        String spaceJeff = "    jeff     ";
        System.out.println(spaceJeff.trim());
        System.out.println(spaceJeff);

        //format
        String name = "Joe";
        String factory = "button";
        String formattedstr = String.format("hello i work for %s,", name, factory);
        System.out.println(formattedstr);

    }
}
