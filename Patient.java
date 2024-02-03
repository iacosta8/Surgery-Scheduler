// Team: Night Owls (Isaac Acosta, Cayden Haas, Eddie Brito)
// CSCI 428 - Homework 1 - Surgery Scheduling System
// Date: 02/02/2024

class Patient {
    String name;
    String dateOfBirth;
    int lastFourSSN;
    String sex;
    String height;
    float weight;
    int icn;

    public Patient(String name, String dateOfBirth, int lastFourSSN, String sex, String height, float weight, int icn) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.lastFourSSN = lastFourSSN;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.icn = icn;
    }
}