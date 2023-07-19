package PersonExercises;


public class InputTest {
    public static void main(String[] args) {
        // Test Input class methods
        Input input = new Input();

        System.out.print("Enter your name: ");
        String name = input.getString();
        Person person1 = new Person(name);
        Person person2 = new Person(name);

        System.out.println("Name comparison: " + person1.getName().equals(person2.getName()));
        System.out.println("Reference comparison: " + (person1 == person2));

        System.out.print("Enter another name: ");
        name = input.getString();
        Person person3 = new Person(name);
        Person person4 = person3;

        System.out.println("Reference comparison: " + (person3 == person4));

        System.out.println("Person 3 name: " + person3.getName());
        System.out.println("Person 4 name: " + person4.getName());

        System.out.print("Enter a new name for Person 4: ");
        name = input.getString();
        person4.setName(name);

        System.out.println("Person 3 name: " + person3.getName());
        System.out.println("Person 4 name: " + person4.getName());
    }
}
