import java.util.Scanner;
public class AppointmentScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter patient details
        System.out.println("\n"); 
        System.out.println("Enter Patient Details:");
        System.out.print("Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String patientDOB = scanner.nextLine();
        System.out.print("Sex: ");
        String patientSex = scanner.nextLine();
        System.out.print("ICN: ");
        String patientICN = scanner.nextLine();

        Patient patient = new Patient(patientName, patientDOB, patientSex, patientICN);

        // Enter doctor details
        System.out.println("\nEnter Doctor Details:");
        System.out.print("Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Practice: ");
        String doctorPractice = scanner.nextLine();
        System.out.print("ID: ");
        int doctorID = scanner.nextInt();

        Doctor doctor = new Doctor(doctorName, doctorPractice, doctorID);

        // Enter scheduling details
        System.out.println("\nEnter Scheduling Details:");
        System.out.print("Date: ");
        String schedulingDate = scanner.next();
        System.out.print("Time: ");
        String schedulingTime = scanner.next();
        System.out.print("Operating Room Number: ");
        int operatingRoomNumber = scanner.nextInt();

        Scheduling scheduling = new Scheduling(schedulingDate, schedulingTime, operatingRoomNumber);

        // Create a scheduled appointment
        Surgery appointment = new Surgery(patient, doctor, scheduling);

        // Display appointment details
        appointment.displayAppointment();

        // Close the scanner
        scanner.close();
    }
}
