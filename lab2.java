import java.util.Scanner;


// task1 gradecalculator
 class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
            System.out.println("Excellent work!");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
            System.out.println("Good job!");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
            System.out.println("You passed.");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
            System.out.println("Need improvement.");
        } else if (score >= 0 && score < 60) {
            System.out.println("Grade: F");
            System.out.println("Failed. Study harder!");
        } else {
            System.out.println("Invalid score!");
        }

        scanner.close();
    }
}

//=========================================================================================//

//task2 dayname

class DayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        // Using switch expression with arrow syntax (Java 14+)
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";  // 6 and 7 both return Weekend
            default -> "Invalid day";
        };

        System.out.println(dayName);
        scanner.close();
    }
}

//=========================================================================================//

//task3  timestable

class TimesTable {
    public static void main(String[] args) {
        // Print header
        System.out.printf("%4s", "");  // Empty corner
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print separator
        System.out.println("    ----------------------------------------");

        // Print table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d |", i);  // Row header
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

//=========================================================================================//

//task4 fizzbuzzz
class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}


//=========================================================================================//

//task5 ATMtask

class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;

        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    } else {
                        System.out.println("Invalid amount !");
                    }
                    break;
                case 4:
                    System.out.println("Thank you! Goodbye.");
                    scanner.close();
                    return;  // Exit the program
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}

