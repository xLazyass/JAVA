//task1 mathutis

class MathUtils {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int absolute(int num) {
        return (num < 0) ? -num : num;
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Max of 5, 10: " + max(5, 10));
        System.out.println("Min of 5, 10: " + min(5, 10));
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("absolute of -7: " + absolute(-7));
        System.out.println("2 to the power 3: " + power(2, 3));
    }
}

//=========================================================================================//

//task2 string utils

class StringUtils {

    public static String repeat(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }
        return result;
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Repeat 'Hi' 3 times: " + repeat("Hi", 3));
        System.out.println("Count 'l' in 'Hello': " + countChar("Hello", 'l'));
    }
}

//=========================================================================================//

//task3 calculator

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(5, 10): " + add(5, 10));
        System.out.println("add(5, 10, 15): " + add(5, 10, 15));
        System.out.println("add(5.5, 2.5): " + add(5.5, 2.5));
    }
}

//=========================================================================================//

//task4 BankUtils

class BankUtils {

    public static double calculateSimpleInterest(double principal, double rate, int years) {
        return (principal * rate * years) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, int years) {
        double amount = principal * Math.pow((1 + rate / 100), years);
        return amount - principal;
    }

    public static void main(String[] args) {
        double principal = 5000;
        double rate = 6.5;
        int years = 3;

        double simpleInterest = calculateSimpleInterest(principal, rate, years);
        double compoundInterest = calculateCompoundInterest(principal, rate, years);

        System.out.println("Principal: $" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Years: " + years);
        System.out.println("Simple Interest: $" + simpleInterest);
        System.out.println("Compound Interest: $" + compoundInterest);
    }
}

//=========================================================================================//

//task5 NumberUtils

class NumberUtils {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumDigits(int num) {
        // Base case: if single digit
        if (num < 10 && num > -10) {
            return num;
        }

        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 20 prime? " + isPrime(20));
        System.out.println("Sum of digits in 12345: " + sumDigits(12345));
    }
}
