public class Calculator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Addition: " + obj.addition(10, 20));
        System.out.println("Subtraction: " + obj.subtraction(20, 10));
        System.out.println("Multiplication: " + obj.multiplication(10, 20));
        System.out.println("Division: " + obj.division(20, 10));
    }
}
