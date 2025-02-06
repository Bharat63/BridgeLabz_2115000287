class Course {
    String name;
    Student[] students;
    int studentCount;

    Course(String name, int capacity) {
        this.name = name;
        students = new Student[capacity];
        studentCount = 0;
    }

    void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            student.addCourse(this);
        } else {
            System.out.println("Course " + name + " is full.");
        }
    }

    void showEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].name);
        }
    }
}

class Student {
    String name;
    Course[] courses;
    int courseCount;

    Student(String name, int maxCourses) {
        this.name = name;
        courses = new Course[maxCourses];
        courseCount = 0;
    }

    void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].name);
        }
    }
}

class School {
    String name;
    Student[] students;
    int studentCount;

    School(String name, int capacity) {
        this.name = name;
        students = new Student[capacity];
        studentCount = 0;
    }

    void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("School is at full capacity.");
        }
    }

    void showStudents() {
        System.out.println("Students in " + name + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].name);
        }
    }
}

public class SchoolAndStudentsWithCourse {
    public static void main(String[] args) {
        School school = new School("Greenwood High", 3);

        Student student1 = new Student("Alice", 2);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 2);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 3);

        math.enrollStudent(student1);
        math.enrollStudent(student2);
        science.enrollStudent(student2);
        science.enrollStudent(student3);

        school.showStudents();

        System.out.println();
        student1.showCourses();
        student2.showCourses();
        student3.showCourses();

        System.out.println();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
