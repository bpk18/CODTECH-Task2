package CodeTech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> grades = new HashMap<>();
        String subject;
        double grade;
        
        while (true) {
            System.out.println("Enter subject (or type 'done' to finish): ");
            subject = scanner.nextLine();
            if (subject.equalsIgnoreCase("done")) {
                break;
            }
            System.out.println("Enter Marks for " + subject + ": ");
            grade = scanner.nextDouble();
            scanner.nextLine();  // consume the newline
            grades.put(subject, grade);
        }
        
        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
            return;
        }
        
        double total = 0;
        for (double g : grades.values()) {
            total += g;
        }
        
        double average = total / grades.size();
        String letterGrade = getLetterGrade(average);
        
        System.out.printf("The average grade is: %.2f\n", average);
        System.out.println("The letter grade is: " + letterGrade);
    }
    
    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
