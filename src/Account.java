public class Account {

        // Attribute
        private double balance;

        // No-argument constructor
        public Account() {
            this.balance = 0.0;
        }

        // Two-argument constructor
        public Account(double balance) {
            this.balance = balance;
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        // Method to withdraw money
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Main method to test the class
        public static void main(String[] args) {
            Account account1 = new Account();
            Account account2 = new Account(1000.0);

            account1.deposit(500.0);
            account2.withdraw(200.0);

            System.out.println("Account1 Balance: " + account1.getBalance());
            System.out.println("Account2 Balance: " + account2.getBalance());
        }
    }


