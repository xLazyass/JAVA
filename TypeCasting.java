public class TypeCasting {
    public static void main(String[] args) {
        // Narrowing cast: double → int (truncates decimal)
        double price = 29.99;
        int priceAsInt = (int) price;
        System.out.println("double price:     " + price);
        System.out.println("cast to int:      " + priceAsInt);

        // Integer division vs floating-point division
        System.out.println("\n7 / 2   = " + (7 / 2));           // int division → 3
        System.out.println("(double)7 / 2 = " + ((double) 7 / 2)); // widening  → 3.5

        // Parsing a String into an int
        String numStr = "42";
        int parsed = Integer.parseInt(numStr);
        System.out.println("\nParsed \"" + numStr + "\" → int: " + parsed);
        System.out.println("Parsed + 8 = " + (parsed + 8)); // proves its a real int
    }
}
