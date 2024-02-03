# Surgery Scheduling System

The goal of this system is to develop a tool for scheduling surgeries. It requires you to input relevant details, which are then utilized to organize and finalize your surgical appointment.

Classes & Objects:

-   Patient: Includes attributes such as name, date of birth, last four digits of SSN, sex, height, weight, and icn(Internal Control Number).

-   Doctor: Comprises name, identification number, and area of specialization.

-   Scheduling: Encompasses operating room number, surgery name, site of surgery, date, and time.

Scheduling Process:

-   Gather Patient Information

-   Collect Doctor Information

-   Establish Scheduling Information

-   Output Appointment Information

Pseudo Code:

-   class Patient (name, dateOfBirth, lastFourSSN, sex, height, weight, icn) 

-   class Doctor (name, specialty, id) 

-   class Scheduling (date, time, nameOfSurgery, surgicalSite, operatingRoomNumber) 

-   class Surgery (patient, doctor, scheduling) 

-   class AppointmentScheduler
