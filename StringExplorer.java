public class StringExplorer {
    public static void main(String[] args) {
        String fullName = "Karim LxZy";

        System.out.println("Full name:      " + fullName);
        System.out.println("Length:         " + fullName.length());
        System.out.println("Uppercase:      " + fullName.toUpperCase());
        System.out.println("Lowercase:      " + fullName.toLowerCase());
        System.out.println("First char:     " + fullName.charAt(0));
        System.out.println("Last char:      " + fullName.charAt(fullName.length() - 1));

        // Reverse using StringBuilder
        String reversed = new StringBuilder(fullName).reverse().toString();
        System.out.println("Reversed:       " + reversed);

        // Check for a space
        boolean hasSpace = fullName.contains(" ");
        System.out.println("Contains space? " + hasSpace);
    }
}
