package app.entities;

import app.enums.Colors;
import app.enums.Manufacturers;

import static java.lang.String.format;

public class Cap extends Product {
    public Cap(Manufacturers manufacturer, Colors color) {
        this.manufacturer = manufacturer.getName();
        this.color = color.getName();
        this.price = manufacturer.getPrice() + color.getPrice();
    }

    @Override
    public String toString() {
        return "Cap (manufacturer: " + manufacturer + "; price " + format("%.2f", price) + ")";
    }
}
