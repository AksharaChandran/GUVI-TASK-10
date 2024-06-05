public class Tea {


    // Method to prepare basic tea
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }

    // Method to add milk
    public void addMilk() {
        System.out.println("Adding milk to the tea.");
    }

    // Method to add sugar
    public void addSugar() {
        System.out.println("Adding sugar to the tea.");
    }

    // Main method to test the class
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
    }
}


