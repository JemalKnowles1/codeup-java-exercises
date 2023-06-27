public class ArraysExercises {
    //    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.toString method is used to covert the insides of an array to human read-able string

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Person[] people = new Person[3];
            people[0] = new Person("Anakin");
            people[1] = new Person("Obi");
            people[2] = new Person("Mace");

            Person[] newPeople = addPerson(people, new Person("Jar-Jar"));

            for (Person person : newPeople) {
                System.out.println(person.getName());
            }
        }

        public static Person[] addPerson(Person[] people, Person newPerson) {
            Person[] newPeople = new Person[people.length + 1];
        //            instantiates a new array, and offers more control over
            System.arraycopy(people, 0, newPeople, 0, people.length);
            newPeople[newPeople.length - 1] = newPerson;
            return newPeople;
        }
    }
}

