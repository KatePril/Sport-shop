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
}
