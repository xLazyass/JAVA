public class BankAccountVariables {
    public static void main(String[] args) {
        String  accountHolder = "Karim LxZy";
        long    accountNumber = 1234567890123456L;
        double  balance       = 15_750.85;
        boolean isActive      = true;

        // Formatted account statement using String.format()
        String statement = String.format(
            "╔══════════════════════════════════════╗%n" +
            "║         ACCOUNT STATEMENT            ║%n" +
            "╠══════════════════════════════════════╣%n" +
            "║  Holder:  %-27s║%n" +
            "║  Account: %-27d║%n" +
            "║  Balance: $%-26.2f║%n" +
            "║  Status:  %-27s║%n" +
            "╚══════════════════════════════════════╝",
            accountHolder,
            accountNumber,
            balance,
            isActive ? "Active ✔" : "Inactive ✘"
        );

        System.out.println(statement);
    }
}
