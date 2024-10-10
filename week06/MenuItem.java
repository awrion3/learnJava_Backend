package week06;

public class MenuItem {
    //attributes
    private String name;
    private double price;

    //constructor - parameter & default
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public MenuItem() {}

    //methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //override
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MenuItem [name=");
        builder.append(name);
        builder.append(", price=");
        builder.append(price);
        builder.append("]\n");
        return builder.toString();
    }
    /*
     @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("┌───────────────┐\n");
        stringBuilder.append("│   Menu Item   │\n");
        stringBuilder.append("├───────────────┤\n");
        stringBuilder.append("│ Name: ").append(name);
        for (int i = 0; i < 2 - name.length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("│\n");
        stringBuilder.append("│ Price: $").append(price);
        for (int i = 0; i < 3 - String.valueOf(price).length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("│\n");
        stringBuilder.append("└───────────────┘");
        return stringBuilder.toString();
    }
    */
}
