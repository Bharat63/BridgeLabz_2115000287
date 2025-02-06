class Patient {
    String name;
    Doctor[] doctors;
    int doctorCount;

    Patient(String name, int maxDoctors) {
        this.name = name;
        this.doctors = new Doctor[maxDoctors];
        this.doctorCount = 0;
    }

    void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount++] = doctor;
        } else {
            System.out.println(name + " cannot consult more doctors.");
        }
    }

    void showDoctors() {
        System.out.println(name + " is consulting:");
        for (int i = 0; i < doctorCount; i++) {
            System.out.println("- " + doctors[i].name);
        }
    }
}

class Doctor {
    String name;
    Patient[] patients;
    int patientCount;

    Doctor(String name, int maxPatients) {
        this.name = name;
        this.patients = new Patient[maxPatients];
        this.patientCount = 0;
    }

    void consult(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount++] = patient;
            patient.addDoctor(this);
            System.out.println("Dr. " + name + " consulted " + patient.name);
        } else {
            System.out.println("Dr. " + name + " cannot take more patients.");
        }
    }

    void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (int i = 0; i < patientCount; i++) {
            System.out.println("- " + patients[i].name);
        }
    }
}

class Hospital {
    String name;

    Hospital(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Welcome to " + name + " Hospital");
    }
}

public class HospitalWithDoctorsPatient{
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care");

        Doctor doctor1 = new Doctor("Alice", 3);
        Doctor doctor2 = new Doctor("Bob", 3);

        Patient patient1 = new Patient("John", 2);
        Patient patient2 = new Patient("Emma", 2);
        Patient patient3 = new Patient("Chris", 2);

        hospital.display();

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);
        doctor2.consult(patient3);

        System.out.println();
        doctor1.showPatients();
        doctor2.showPatients();

        System.out.println();
        patient1.showDoctors();
        patient2.showDoctors();
        patient3.showDoctors();
    }
}
