class Course {
    String name;
    Student[] students;
    int studentCount;
    Professor professor;

    Course(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
            student.addCourse(this);
            System.out.println(student.name + " enrolled in " + name);
        } else {
            System.out.println("Course " + name + " is full.");
        }
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println("Professor " + professor.name + " is assigned to " + name);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i].name);
        }
    }

    void showProfessor() {
        if (professor != null) {
            System.out.println(name + " is taught by Prof. " + professor.name);
        } else {
            System.out.println(name + " has no professor assigned.");
        }
    }
}

class Student {
    String name;
    Course[] courses;
    int courseCount;

    Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].name);
        }
    }
}

class Professor {
    String name;
    Course[] courses;
    int courseCount;

    Professor(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    void addCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        }
    }

    void showCourses() {
        System.out.println("Prof. " + name + " teaches:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].name);
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 3);
        Student s2 = new Student("Bob", 3);

        Professor p1 = new Professor("Dr. Smith", 2);
        Professor p2 = new Professor("Dr. Johnson", 2);

        Course c1 = new Course("Data Structures", 3);
        Course c2 = new Course("Operating Systems", 3);

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        System.out.println();
        s1.showCourses();
        s2.showCourses();
        System.out.println();

        p1.showCourses();
        p2.showCourses();
        System.out.println();

        c1.showStudents();
        c1.showProfessor();
        System.out.println();

        c2.showStudents();
        c2.showProfessor();
    }
}
