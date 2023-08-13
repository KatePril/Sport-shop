package app.entities;

import static java.lang.String.format;

public class Order {

    private String name;
    private Cap cap;
    private TShirt tShirt;
    private double total;

    public Order(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setSum() {
        this.total = cap.getPrice() + tShirt.getPrice();
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    public TShirt gettShirt() {
        return tShirt;
    }

    public void settShirt(TShirt tShirt) {
        this.tShirt = tShirt;
    }

    @Override
    public String toString() {
        String total = format("%.2f", this.total);
        return "Order" + name + ":\n" + cap + ";\n" + tShirt + ";\n" + "Total: " + total;
    }
}
