public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Invoke methods
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + calculator.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.7: " + calculator.add(2.5, 3.7));
    }
}


 

 


 

