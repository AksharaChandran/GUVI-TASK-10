public class Employee {

           // Attributes
        private int id;
        private String firstName;
        private String lastName;
        private int salary;

        // Constructor
        public Employee(int id, String firstName, String lastName, int salary) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        // Getter methods
        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getName() {
            return firstName + " " + lastName;
        }

        public int getSalary() {
            return salary;
        }

        // Method to get annual salary
        public int getAnnualSalary() {
            return salary * 12;
        }

        // Method to raise salary by a percentage
        public int raiseSalary(int percent) {
            salary += salary * percent / 100;
            return salary;
        }

        // toString method
        @Override
        public String toString() {
            return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Create a new Employee object
            Employee emp = new Employee(1, "Akshara", "Chandran", 5000);

            // Use the methods
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Annual Salary: " + emp.getAnnualSalary());
            System.out.println("Salary after 10% raise: " + emp.raiseSalary(10));
            System.out.println(emp.toString());
        }
    }

