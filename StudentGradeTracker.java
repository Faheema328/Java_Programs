import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student Grade Tracker
 * This program manages student names and their grades.
 * It calculates average, highest, and lowest scores.
 * Author: Shaik Faheemunnisa
 * Internship: CodeAlpha - Task 1
 */

public class StudentGradeTracker {

    // Store Student Names
    static ArrayList<String> studentNames = new ArrayList<>();

    // Store Student Grades
    static ArrayList<Double> studentGrades = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("========================================");
        System.out.println("     WELCOME TO STUDENT GRADE TRACKER   ");
        System.out.println("========================================");

        // Keep showing menu until user exits
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Summary Report");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    viewSummaryReport();
                    break;
                case 4:
                    System.out.println("\nThank you! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    // Method to add a new student and their grade
    static void addStudent(Scanner scanner) {
        System.out.print("\nEnter student name: ");
        String name = scanner.next();

        System.out.print("Enter grade (0-100): ");
        double grade = scanner.nextDouble();

        // Validate grade range
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade! Please enter between 0 and 100.");
            return;
        }

        // Add to lists
        studentNames.add(name);
        studentGrades.add(grade);

        System.out.println("Student " + name + " added successfully!");
    }

    // Method to display all students and their grades
    static void viewAllStudents() {
        if (studentNames.isEmpty()) {
            System.out.println("\nNo students added yet!");
            return;
        }

        System.out.println("\n--- ALL STUDENTS ---");
        System.out.println("No. | Name         | Grade | Letter Grade");
        System.out.println("----+--------------+-------+-------------");

        for (int i = 0; i < studentNames.size(); i++) {
            String letterGrade = getLetterGrade(studentGrades.get(i));
            System.out.printf("%-4d| %-13s| %-6.1f| %s%n",
                    (i + 1), studentNames.get(i), studentGrades.get(i), letterGrade);
        }
    }

    // Method to show summary report
    static void viewSummaryReport() {
        if (studentNames.isEmpty()) {
            System.out.println("\nNo students to show report for!");
            return;
        }

        double total = 0;
        double highest = studentGrades.get(0);
        double lowest = studentGrades.get(0);
        String topStudent = studentNames.get(0);
        String lowStudent = studentNames.get(0);

        // Loop to calculate total, highest, lowest
        for (int i = 0; i < studentGrades.size(); i++) {
            double grade = studentGrades.get(i);
            total += grade;

            if (grade > highest) {
                highest = grade;
                topStudent = studentNames.get(i);
            }

            if (grade < lowest) {
                lowest = grade;
                lowStudent = studentNames.get(i);
            }
        }

        double average = total / studentGrades.size();

        System.out.println("\n===== SUMMARY REPORT =====");
        System.out.println("Total Students : " + studentNames.size());
        System.out.printf("Average Score  : %.2f%n", average);
        System.out.printf("Highest Score  : %.2f (%s)%n", highest, topStudent);
        System.out.printf("Lowest Score   : %.2f (%s)%n", lowest, lowStudent);
        System.out.println("==========================");
    }

    // Method to convert number grade to letter grade
    static String getLetterGrade(double grade) {
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "F";
    }
}