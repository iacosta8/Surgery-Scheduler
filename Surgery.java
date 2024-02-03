// Team: Night Owls (Isaac Acosta, Cayden Haas, Eddie Brito)
// CSCI 428 - Homework 1 - Surgery Scheduling System
// Date: 02/02/2024

class Surgery {
    Patient patient;
    Doctor doctor;
    Scheduling scheduling;

    public Surgery(Patient patient, Doctor doctor, Scheduling scheduling) {
        this.patient = patient;
        this.doctor = doctor;
        this.scheduling = scheduling;
    }

    public void displayAppointment() {
        System.out.println("\n"); 
        System.out.println("Your surgery has been scheduled!"); 
        System.out.println("--------------------------------"); 
        System.out.println("Appointment Details:");
        System.out.println("Patient: " + patient.name);
        System.out.println("Doctor: " + doctor.name);
        System.out.println("Date: " + scheduling.date);
        System.out.println("Time: " + scheduling.time);
        System.out.println("Surgery Name: " + scheduling.nameOfSurgery);
        System.out.println("Site of Surgery: " + scheduling.surgicalSite);
        System.out.println("Operating Room Number: " + scheduling.operatingRoomNumber);
        System.out.println("--------------------------------"); 
        System.out.println("\n"); 
    }
}
