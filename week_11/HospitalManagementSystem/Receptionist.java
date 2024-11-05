package week_11.HospitalManagementSystem;

public class Receptionist extends User{
    public Receptionist(int ID, String name) {
        super(ID, name);
    }

    public Appointment createAppointment(Patient patient, Doctor doctor, String date) {
        return new Appointment(patient, doctor, date);
    }

    public Bill generateBill(int id, Patient patient, String title, int price) {
        return new Bill(id, patient, title, price);
    }
}
