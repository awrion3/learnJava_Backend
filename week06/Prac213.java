package week06;

public class Prac213 {
    public static void main(String[] args) {
        //creates instance using class Car
        Car car = new Car();

        String brand;

        car.setBrand("BMW");
        car.setModel("i7");
        car.vehicleType = "car";
        car.setFuelType("Gasoline");
        car.setManufactureYear(2024);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getFuelType());
        System.out.println(car.getTransmission());
    }
}
