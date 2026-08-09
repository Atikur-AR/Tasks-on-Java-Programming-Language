package Class_Task;

class CarShowroom {
    String name;
    String model;
    static int CarCount = 0;

    CarShowroom(String n, String m) {
        name = n;
        model = m;
        CarCount++;
        System.out.println("You have created a car of model : " + m);
    }
}

public class DesignCarShowroom {
    static void main() {
        CarShowroom Car1 = new CarShowroom("56", "Suzuki");
        CarShowroom Car2 = new CarShowroom("01", "Yamaha");
        CarShowroom Car3 = new CarShowroom("587", "Pulsar");
        System.out.println("The total number of cars are : " + CarShowroom.CarCount);
    }
}
