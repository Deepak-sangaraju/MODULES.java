class Doctor {
    String type;
    int fee;

    // Default constructor
    Doctor() {
        type = "General Doctor";
        fee = 300;
    }

    void consultationFee() {
        System.out.println(type + " consultation fee: Rs. " + fee);
    }
}

class Dentist extends Doctor {

    // Default constructor of subclass
    Dentist() {
        type = "Dentist";
        fee = 500;
    }
}

class Cardiologist extends Doctor {

    // Default constructor of subclass
    Cardiologist() {
        type = "Cardiologist";
        fee = 1000;
    }
}

class Surgeon extends Doctor {

    // Default constructor of subclass
    Surgeon() {
        type = "Surgeon";
        fee = 1500;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects using DEFAULT constructors
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        System.out.println("Consultation Fees:");
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
