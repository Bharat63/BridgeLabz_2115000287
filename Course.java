import java.util.Scanner;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("\nInstitute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Duration (months): ");
        int duration1 = sc.nextInt();
        System.out.print("Enter Fee: ");
        double fee1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Duration (months): ");
        int duration2 = sc.nextInt();
        System.out.print("Enter Fee: ");
        double fee2 = sc.nextDouble();
        sc.nextLine();

        Course c1 = new Course(name1, duration1, fee1);
        Course c2 = new Course(name2, duration2, fee2);

        System.out.print("\nEnter new Institute Name: ");
        String newInstitute = sc.nextLine();
        Course.updateInstituteName(newInstitute);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        sc.close();
    }
}
