package week06;

public class Vehicle {
    protected String vehicleType;
    private String brand;
    private String model;

    //get-set methods shortcut alt+insert
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
