// 1. Interface Vehicle
interface Vehicle {
    String getType();
}

// 2. Implementasi untuk Car
class Car implements Vehicle {
    @Override
    public String getType() {
        return "This is a Car.";
    }
}

// 3. Implementasi untuk Bike
class Bike implements Vehicle {
    @Override
    public String getType() {
        return "This is a Bike.";
    }
}

// 4. Factory class
class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "car" -> {
                return new Car();
            }
            case "bike" -> {
                return new Bike();
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        System.out.println(car.getType());  // Output: This is a Car.

        Vehicle bike = VehicleFactory.createVehicle("bike");
        System.out.println(bike.getType());  // Output: This is a Bike.
    }
}
