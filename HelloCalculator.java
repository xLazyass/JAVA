public class HelloCalculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum:              " + (a + b));
        System.out.println("Difference:       " + (a - b));
        System.out.println("Product:          " + (a * b));
        System.out.println("Integer Division: " + (a / b));
        System.out.println("Modulo:           " + (a % b));
        System.out.println("Divisible by b?   " + (a % b == 0));
    }
}
