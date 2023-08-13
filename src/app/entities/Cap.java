package app.entities;

import app.utils.Constants;

import static java.lang.String.format;

public class Cap {

    private String manufacturer;
    private String color;
    private double price;

    public Cap(String color) {
        this.manufacturer = Constants.CAP_MANUFACTURER;
        this.color = color;
        this.price = definePrice(color);
    }

    private double definePrice(String color) {
        switch (color) {
            case "black" -> {
                return 15.80;
            }
            case "white" -> {
                return 14.25;
            }
            default -> {
                return 0.00;
            }
        }
    }

    @Override
    public String toString() {
        return "Cap (manufacturer: " + manufacturer + "; price " + format("%.2f", price) + ")";
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
