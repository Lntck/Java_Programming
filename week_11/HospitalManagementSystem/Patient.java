package week_11.HospitalManagementSystem;

import java.util.Objects;

public class Patient extends User{
    public Patient(int ID, String name) {
        super(ID, name);
    }

    public void payBill(Bill bill) {
        if (Objects.equals(bill.getPatient().getName(), this.getName())) {
            System.out.println(this.getName() + " payed for the bill: " + bill.getTitle() + ", Price: " + bill.getAmount());
            bill.setPaid(true);
        } else {
            System.out.println("Patient incorrect");
        }
    }
}
