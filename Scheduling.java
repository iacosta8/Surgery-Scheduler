// Team: Night Owls (Isaac Acosta, Cayden Haas, Eddie Brito)
// CSCI 428 - Homework 1 - Surgery Scheduling System
// Date: 02/02/2024

class Scheduling {
    String date;
    String time;
    String nameOfSurgery;
    String surgicalSite;
    int operatingRoomNumber;

    public Scheduling(String date, String time, String nameOfSurgery, String surgicalSite, int operatingRoomNumber) {
        this.date = date;
        this.time = time;
        this.nameOfSurgery = nameOfSurgery;
        this.surgicalSite = surgicalSite;
        this.operatingRoomNumber = operatingRoomNumber;
    }
}