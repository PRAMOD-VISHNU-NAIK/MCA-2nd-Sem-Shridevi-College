import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student RollNo: ");
        String rollNo =  scanner.nextLine();

        // Input marks for different subjects
        System.out.print("Enter marks for Mathematics: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int englishMarks = scanner.nextInt();

        System.out.print("Enter marks for History: ");
        int historyMarks = scanner.nextInt();

        System.out.print("Enter marks for Computer Science: ");
        int csMarks = scanner.nextInt();

        // Calculate total marks, average, and grade
        int totalMarks = mathMarks + scienceMarks + englishMarks + historyMarks + csMarks;
        double averageMarks = totalMarks / 5.0;
        char grade;

        // if-else-if Ladder.
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output results
        System.out.println("\n--- Student Report ---");
        System.out.printf("Name: %s%n", studentName);
        System.out.printf("Name: %s%n", rollNo);
        System.out.printf("Total Marks: %d%n", totalMarks);
        System.out.printf("Average Marks: %.2f%n", averageMarks);
        System.out.printf("Grade: %c%n", grade);

        scanner.close();
    }
}
