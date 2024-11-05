package week_11.HospitalManagementSystem;

public class Bill {
    private final int id;
    private final Patient patient;
    private final String title;
    private final int amount;
    private boolean paid=false;

    public Bill(int id, Patient patient, String title, int amount) {
        this.id = id;
        this.patient = patient;
        this.title = title;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
