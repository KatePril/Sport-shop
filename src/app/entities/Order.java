package app.entities;

public class Order {
    private Cap cap;
    private TShirt tShirt;
    private double total;

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
        return "Order:\n" + cap + ";\n" + tShirt + ";\n" + "Total: " + total;
    }
}
