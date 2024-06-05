public class Person {


        // Attributes
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Create a new Person object
            Person person = new Person("Akshara Franseska", 24);

            // Use the getter methods
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    }


