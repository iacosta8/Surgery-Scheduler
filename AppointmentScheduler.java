// Team: Night Owls (Isaac Acosta, Cayden Haas, Eddie Brito)
// CSCI 428 - Homework 1 - Surgery Scheduling System
// Date: 02/02/2024

import java.util.Scanner;
public class AppointmentScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Enter patient details
        System.out.println("\n"); 
        System.out.println("Enter Patient Details:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String patientDOB = scanner.nextLine();
        System.out.print("Last 4 SSN: ");
        int patientSSN = Integer.parseInt(scanner.nextLine());
        System.out.print("Sex: ");
        String patientSex = scanner.nextLine();
        System.out.print("Height: ");
        String patientHeight = scanner.nextLine();
        System.out.print("Weight: ");
        float patientWeight = Float.parseFloat(scanner.nextLine());
        System.out.print("ICN: ");
        int patientICN = Integer.parseInt(scanner.nextLine());

        Patient patient = new Patient(patientName, patientDOB, patientSSN, patientSex, patientHeight, patientWeight, patientICN);

        // Enter doctor details
        System.out.println("\nEnter Doctor Details:");
        System.out.print("Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Specialty: ");
        String doctorSpecialty = scanner.nextLine();
        System.out.print("ID: ");
        int doctorID = scanner.nextInt();

        Doctor doctor = new Doctor(doctorName, doctorSpecialty, doctorID);

        // Enter scheduling details
        System.out.println("\nEnter Scheduling Details:");
        System.out.print("Date: ");
        String schedulingDate = scanner.next();
        System.out.print("Time: ");
        String schedulingTime = scanner.next();
        System.out.print("Name of Surgery: ");  
        String schedulingName = scanner.next();
        System.out.print("Surgical Site: ");    
        String schedulingSite = scanner.next();
        System.out.print("Operating Room Number: ");
        int operatingRoomNumber = scanner.nextInt();

        Scheduling scheduling = new Scheduling(schedulingDate, schedulingTime, schedulingName, schedulingSite, operatingRoomNumber);

        // Create a scheduled appointment
        Surgery appointment = new Surgery(patient, doctor, scheduling);

        // Display appointment details
        appointment.displayAppointment();

        // Close the scanner
        scanner.close();
    }
}
