package week_11.HospitalManagementSystem;

public class Main_9 {
    public static void main(String[] args) {
        // Создаем пациентов
        Patient patient1 = new Patient(1, "John Doe");
        Patient patient2 = new Patient(2, "Jane Smith");

        // Создаем регистраторов
        Receptionist receptionist1 = new Receptionist(1, "Alice Johnson");
        Receptionist receptionist2 = new Receptionist(2, "Bob Williams");

        // Создаем врачей
        Doctor doctor1 = new Doctor(1, "Dr. Emily Davis");
        Doctor doctor2 = new Doctor(2, "Dr. Michael Brown");

        // Назначаем приемы
        Appointment appointment1 = receptionist1.createAppointment(patient1, doctor1, "05.11.2024 12:30");
        Appointment appointment2 = receptionist2.createAppointment(patient2, doctor2, "05.11.2024 10:30");

        // Выводим информацию о приемах
        System.out.println("Appointments:");
        System.out.println("Patient: " + appointment1.getPatient().getName() + ", Doctor: " + appointment1.getDoctor().getName());
        System.out.println("Patient: " + appointment2.getPatient().getName() + ", Doctor: " + appointment2.getDoctor().getName());

        // Генерируем счета для пациентов
        Bill bill1 = receptionist1.generateBill(1, patient1, "Consultation", 150);
        Bill bill2 = receptionist2.generateBill(2, patient2, "X-Ray", 200);

        // Выводим информацию о счетах
        System.out.println("\nBills:");
        System.out.println("Patient: " + bill1.getPatient().getName() + ", Bill ID: " + bill1.getId() + ", Amount: $" + bill1.getAmount());
        System.out.println("Patient: " + bill2.getPatient().getName() + ", Bill ID: " + bill2.getId() + ", Amount: $" + bill2.getAmount());

        // Пациенты оплачивают свои счета
        patient1.payBill(bill1);
        patient2.payBill(bill2);

        // Проверяем оплату счетов
        System.out.println("\nBill Payment Status:");
        System.out.println("Bill ID: " + bill1.getId() + ", Paid: " + bill1.isPaid());
        System.out.println("Bill ID: " + bill2.getId() + ", Paid: " + bill2.isPaid());
    }
}
