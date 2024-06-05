public class TeaTest {

        public static void main(String[] args) {
            // Create an array of Tea objects
            Tea[] teas = new Tea[4];
            teas[0] = new Tea();
            teas[1] = new BlackTea();
            teas[2] = new GreenTea();
            teas[3] = new HerbalTea();

            // Use a loop to prepare each type of tea
            for (Tea tea : teas) {
                tea.prepareTea();
            }
        }
    }

