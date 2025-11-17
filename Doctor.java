class Doctor {
    void consultationFee() {
        System.out.println("General doctor consultation fee: Rs. 300");
    }
}

class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: Rs. 500");
    }
}

class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: Rs. 1000");
    }
}

class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: Rs. 1500");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating objects of each subclass
        Doctor d1 = new Dentist();
        Doctor d2 = new Cardiologist();
        Doctor d3 = new Surgeon();

        System.out.println("Consultation Fees:");
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}
