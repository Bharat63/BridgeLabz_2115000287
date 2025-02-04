import java.util.Scanner;

class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated Grade: " + grade);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        Student student = new Student(name, rollNumber, grade);
        student.displayStudentDetails();
        Student.displayTotalStudents();
        System.out.print("Enter New Grade to Update: ");
        String newGrade = scanner.nextLine();
        student.updateGrade(newGrade);
        scanner.close();
    }
}
