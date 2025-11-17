class Doctor {
    String type;
    int fee;

    // Parameterized constructor
    Doctor(String type, int fee) {
        this.type = type;
        this.fee = fee;
    }

    void consultationFee() {
        System.out.println(type + " consultation fee: Rs. " + fee);
    }
}

class Dentist extends Doctor {

    // Parameterized constructor
    Dentist(String type, int fee) {
        super(type, fee);  // calling parent constructor
    }
}

class Cardiologist extends Doctor {

    // Parameterized constructor
    Cardiologist(String type, int fee) {
        super(type, fee);
    }
}

class Surgeon extends Doctor {

    // Parameterized constructor
    Surgeon(String type, int fee) {
        super(type, fee);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects using PARAMETERIZED constructors
        Dentist d = new Dentist("Dentist", 500);
        Cardiologist c = new Cardiologist("Cardiologist", 1000);
        Surgeon s = new Surgeon("Surgeon", 1500);

        System.out.println("Consultation Fees:");
        d.consultationFee();
        c.consultationFee();
        s.consultationFee();
    }
}
