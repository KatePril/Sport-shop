package app.entities;

import app.enums.Colors;
import app.enums.Manufacturers;

import static java.lang.String.format;

public class TShirt extends Product {

    public TShirt(Manufacturers manufacturer, Colors color) {
        this.manufacturer = manufacturer.getName();
        this.color = color.getName();
        this.price = manufacturer.getPrice() + color.getPrice();
    }

    @Override
    public String toString() {
        return "T-Shirt (manufacturer: " + manufacturer + "; price " + format("%.2f", price) + ")";
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
