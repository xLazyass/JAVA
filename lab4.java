import java.util.ArrayList;
import java.util.Collections;

//task1 arraystatistics

class ArrayStatistics {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 88, 91, 73, 95};

        int min = scores[0];
        int max = scores[0];
        int sum = 0;
        int countAbove80 = 0;

        for (int score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
            sum += score;
            if (score > 80) countAbove80++;
        }

        double average = (double) sum / scores.length;

        System.out.println("Array Statistics:");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
        System.out.println("Count above 80: " + countAbove80);
    }
}

//=========================================================================================//

//task2 ReverseArray

class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        printArray(numbers);

        // 2pointers '//
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed array:");
        printArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//=========================================================================================//

//task3 shoppiingcart


class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Shopping Cart ===");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. List items");
            System.out.println("4. Clear cart");
            System.out.println("5. Check item exists");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = scanner.nextLine();
                    cart.add(item);
                    System.out.println(item + " added.");
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String toRemove = scanner.nextLine();
                    if (cart.remove(toRemove)) {
                        System.out.println(toRemove + " removed.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    System.out.println("Cart contents:");
                    for (String i : cart) {
                        System.out.println("- " + i);
                    }
                    break;
                case 4:
                    cart.clear();
                    System.out.println("Cart cleared.");
                    break;
                case 5:
                    System.out.print("Enter item to check: ");
                    String toCheck = scanner.nextLine();
                    System.out.println(cart.contains(toCheck) ? "Found!" : "Not found.");
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

//=========================================================================================//

//task4 StringAnalyser

class StringAnalyser {
    public static void main(String[] args) {
        String text = "A man a plan a canal Panama madam racecar";

        // Word count
        String[] words = text.split("\\s+");
        System.out.println("Word count: " + words.length);

        // Character count
        System.out.println("Character count: " + text.length());

        // Most frequent character (letters only, case insensitive)
        int[] freq = new int[26];
        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        int maxFreq = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) (i + 'a');
            }
        }
        System.out.println("Most frequent letter: " + mostFrequent + " (" + maxFreq + " times)");

        // Vowel count
        int vowels = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
        }
        System.out.println("Vowel count: " + vowels);

        // Palindromes in text
        System.out.println("Palindromes found:");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println("- " + word);
            }
        }
    }

    // Check if string is palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return str.length() > 0;  // Non-empty strings only
    }
}

//=========================================================================================//

//task5  grade

class GradeBook {
    public static void main(String[] args) {
        // Parallel ArrayLists
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();

        // Add students
        students.add("Alice");   grades.add(92);
        students.add("Bob");     grades.add(78);
        students.add("Charlie"); grades.add(85);
        students.add("Diana");   grades.add(95);
        students.add("Eve");     grades.add(88);

        // Calculate average
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.size();

        // Find highest and lowest
        int maxGrade = Collections.max(grades);
        int minGrade = Collections.min(grades);
        String topStudent = students.get(grades.indexOf(maxGrade));
        String bottomStudent = students.get(grades.indexOf(minGrade));

        // Print report card (sorted by name)
        System.out.println("=== REPORT CARD ===\n");

        // Create a copy for sorting
        ArrayList<String> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents);

        for (String student : sortedStudents) {
            int index = students.indexOf(student);
            int grade = grades.get(index);
            String letterGrade = getLetterGrade(grade);
            System.out.printf("%-10s: %3d (%s)%n", student, grade, letterGrade);
        }

        System.out.println("\n=== STATISTICS ===");
        System.out.printf("Class Average: %.2f%n", average);
        System.out.println("Highest: " + maxGrade + " (" + topStudent + ")");
        System.out.println("Lowest: " + minGrade + " (" + bottomStudent + ")");
    }

    public static String getLetterGrade(int score) {
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }
}
