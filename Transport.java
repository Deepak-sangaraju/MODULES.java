class Transport {
    void move() {
        System.out.println("Transport can move from one place to another.");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Bus object
        Bus bus = new Bus();
        System.out.println("Bus Details:");
        bus.move();
        bus.carryPassengers();

        System.out.println();

        // Creating Truck object
        Truck truck = new Truck();
        System.out.println("Truck Details:");
        truck.move();
        truck.carryGoods();
    }
}
