class Doctor {
    String type;
    int fee;

    // Constructor
    Doctor(String type, int fee) {
        this.type = type;
        this.fee = fee;
    }

    void consultationFee() {
        System.out.println(type + " consultation fee: Rs. " + fee);
    }
}

class Dentist extends Doctor {
    Dentist() {
        super("Dentist", 500);   // calling parent constructor
    }
}

class Cardiologist extends Doctor {
    Cardiologist() {
        super("Cardiologist", 1000);
    }
}

class Surgeon extends Doctor {
    Surgeon() {
        super("Surgeon", 1500);
    }
}

public class Main {
    public static void main(String[] args) {

        // Objects created using constructors
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        System.out.println("Consultation Fees:");
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
