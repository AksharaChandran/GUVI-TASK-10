public class Circle {

        // Attribute
        private double radius;

        // No-argument constructor
        public Circle() {
            this.radius = 0.0;
        }

        // Two-argument constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Method to calculate circumference
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // Getter for radius
        public double getRadius() {
            return radius;
        }

        // Setter for radius
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Main method to test the class
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            Circle circle2 = new Circle(5.0);

            System.out.println("Circle1 Radius: " + circle1.getRadius());
            System.out.println("Circle1 Circumference: " + circle1.getCircumference());

            System.out.println("Circle2 Radius: " + circle2.getRadius());
            System.out.println("Circle2 Circumference: " + circle2.getCircumference());
        }
    }


