package DesignPatterns;

enum CarType {
    MICRO, MINI, LUXURY;
}

enum Location {
    INDIA, USA, BHUTAN;
}

abstract class Car {
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void showCar();

    @Override
    public String toString() {
        return "DesignPatterns.Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class MicroCar extends Car {
    public MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    void showCar() {
        System.out.println("This is car of type micro");
    }
}

class MiniCar extends Car {
    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    void showCar() {
        System.out.println("This is car of type mini");
    }
}

class LuxuryCar extends Car {
    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }

    void showCar() {
        System.out.println("This is car of type luxury");
    }
}

class IndianCar {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;

        }
        return car;
    }
}

class USACar {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;

        }
        return car;
    }
}

class BhutanCar {
    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case MINI:
                car = new MiniCar(Location.BHUTAN);
                break;
            case MICRO:
                car = new MicroCar(Location.BHUTAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.BHUTAN);
                break;

        }
        return car;
    }
}

class CarFactory {
    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCar.buildCar(carType);
                break;
            case USA:
                car = USACar.buildCar(carType);
                break;
            case BHUTAN:
                car = BhutanCar.buildCar(carType);
                break;
        }

        return car;
    }
}

public class CarAbstractFactoryMain {
    public static void main(String[] args) {
        Car carFactory = CarFactory.buildCar(CarType.MINI, Location.BHUTAN);
        System.out.println(CarFactory.buildCar(CarType.MINI, Location.BHUTAN));
        carFactory.showCar();
    }
}
