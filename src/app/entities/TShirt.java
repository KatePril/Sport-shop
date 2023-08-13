package app.entities;

import app.utils.Constants;

public class TShirt {
    private String manufacturer;
    private String color;
    private double price;

    public TShirt(String color) {
        this.manufacturer = Constants.T_SHIRT_MANUFACTURER;
        this.color = color;
        this.price = definePrice(color);
    }

    private double definePrice(String color) {
        switch (color) {
            case "red" -> {
                return 18.45;
            }
            case "blue" -> {
                return 17.60;
            }
            default -> {
                return 0.00;
            }
        }
    }
    @Override
    public String toString() {
        return "T-Shirt (manufacturer: " + manufacturer + "; price" + price + ")";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
