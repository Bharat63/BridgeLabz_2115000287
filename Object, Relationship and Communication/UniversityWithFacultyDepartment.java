class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Department: " + name);
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

class University {
    String name;
    Department[] departments;
    int deptCount;
    Faculty[] faculties;
    int facultyCount;

    University(String name, int deptCapacity, int facultyCapacity) {
        this.name = name;
        departments = new Department[deptCapacity];
        faculties = new Faculty[facultyCapacity];
        deptCount = 0;
        facultyCount = 0;
    }

    void addDepartment(String deptName) {
        if (deptCount < departments.length) {
            departments[deptCount++] = new Department(deptName);
        } else {
            System.out.println("Cannot add more departments.");
        }
    }

    void addFaculty(Faculty faculty) {
        if (facultyCount < faculties.length) {
            faculties[facultyCount++] = faculty;
        } else {
            System.out.println("Cannot add more faculties.");
        }
    }

    void showDepartments() {
        System.out.println(name + " Departments:");
        for (int i = 0; i < deptCount; i++) {
            departments[i].display();
        }
    }

    void showFaculties() {
        System.out.println(name + " Faculties:");
        for (int i = 0; i < facultyCount; i++) {
            faculties[i].display();
        }
    }

    void deleteUniversity() {
        departments = null; // Composition: Deleting the university deletes its departments
        System.out.println("University deleted, all departments removed.");
    }
}

public class UniversityWithFacultyDepartment {
    public static void main(String[] args) {
        University uni = new University("Tech University", 3, 3);

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        uni.addDepartment("Physics");

        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        uni.addFaculty(faculty1);
        uni.addFaculty(faculty2);

        uni.showDepartments();
        uni.showFaculties();

        uni.deleteUniversity();

        System.out.println("\nFaculty members still exist independently:");
        faculty1.display();
        faculty2.display();
    }
}
