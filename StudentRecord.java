import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;
    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class StudentList {
    private Student head;
    void addStudent(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    void deleteStudent(int rollNo) {
        if (head != null && head.rollNo == rollNo) head = head.next;
        else {
            Student temp = head;
            while (temp != null && temp.next != null && temp.next.rollNo != rollNo) temp = temp.next;
            if (temp != null && temp.next != null) temp.next = temp.next.next;
        }
    }
    void displayStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList list = new StudentList();
        while (true) {
            System.out.println("1. Add Student 2. Delete Student 3. Display 4. Exit");
            int choice = scanner.nextInt();
            if (choice == 4) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter RollNo, Name, Age, Grade:");
                    list.addStudent(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                }
                case 2 -> {
                    System.out.println("Enter RollNo to Delete:");
                    list.deleteStudent(scanner.nextInt());
                }
                case 3 -> list.displayStudents();
            }
        }
        scanner.close();
    }
}
