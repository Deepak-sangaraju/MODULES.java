class Cellphone {

    void ringing() {
        System.out.println("Ringing...");
    }

    void vibrating() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }

    void sendMessage() {
        System.out.println("Sending message...");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create Cellphone object
        Cellphone phone = new Cellphone();

        // Call methods
        phone.ringing();
        phone.vibrating();
        phone.callFriend();
        phone.sendMessage();
    }
}
