import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age +
                           ", Total Bill: ₹" + calculateBill());
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int daysAdmitted;
    private List<String> medicalRecords = new ArrayList<>();

    public InPatient(String patientId, String name, int age, double roomChargePerDay, int daysAdmitted) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
    }

    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ": " + medicalRecords);
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient patient1 = new InPatient("P101", "Rahul", 45, 2000, 5);
        patient1.addRecord("Diagnosed with fever");
        patients.add(patient1);
        patients.add(new OutPatient("P202", "Priya", 30, 500));

        for (Patient patient : patients) {
            patient.getPatientDetails();
        }

        patient1.viewRecords();
    }
}
