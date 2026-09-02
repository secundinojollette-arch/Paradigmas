public class Calculador {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculador calc = new Calculador();
        System.out.println("Sum of 2 integers: " + calc.add(5, 3));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));
    }
}

