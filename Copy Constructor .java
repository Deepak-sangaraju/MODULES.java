class Doctor {
    String type;
    int fee;

    // Default constructor
    Doctor() {
        type = "General Doctor";
        fee = 300;
    }

    // Copy constructor
    Doctor(Doctor d) {
        this.type = d.type;
        this.fee = d.fee;
    }

    void consultationFee() {
        System.out.println(type + " consultation fee: Rs. " + fee);
    }
}

class Dentist extends Doctor {
    Dentist() {
        super();        // Calls default Doctor constructor
        type = "Dentist";
        fee = 500;
    }

    // Copy constructor
    Dentist(Dentist d) {
        super(d);
    }
}

class Cardiologist extends Doctor {
    Cardiologist() {
        super();
        type = "Cardiologist";
        fee = 1000;
    }

    // Copy constructor
    Cardiologist(Cardiologist c) {
        super(c);
    }
}

class Surgeon extends Doctor {
    Surgeon() {
        super();
        type = "Surgeon";
        fee = 1500;
    }

    // Copy constructor
    Surgeon(Surgeon s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create original objects
        Dentist d1 = new Dentist();
        Cardiologist c1 = new Cardiologist();
        Surgeon s1 = new Surgeon();

        // Create copied objects using copy constructors
        Dentist d2 = new Dentist(d1);
        Cardiologist c2 = new Cardiologist(c1);
        Surgeon s2 = new Surgeon(s1);

        System.out.println("Original and Copied Consultation Fees:");
        d1.consultationFee();
        d2.consultationFee();
        System.out.println();

        c1.consultationFee();
        c2.consultationFee();
        System.out.println();

        s1.consultationFee();
        s2.consultationFee();
    }
}
