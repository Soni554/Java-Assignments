interface Servicing {
    void getServiceTime();
}

class Car implements Servicing {
    public void getServiceTime() {
        System.out.println("Servicing time for Car is: 9 AM");
    }
}

class Bike implements Servicing {
    public void getServiceTime() {
        System.out.println("Servicing time for Bike is: 10 AM");
    }
}

class Main {
    public static void main(String[] args) {
        (new Car()).getServiceTime();
        (new Bike()).getServiceTime();
    }
}
