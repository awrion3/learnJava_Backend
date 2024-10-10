package week06;

//inherited from Vehicle class
public class Car extends Vehicle {
    private String fuelType;
    private String transmission;
    private int manufactureYear;

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public int getManufactureYear() {
        return manufactureYear;
    }
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
}
