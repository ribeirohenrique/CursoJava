package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product: " + "Name = " + name + ", Price = R$" + String.format("%.2f", price) + ", Quantity = " + quantity + " units, Total: R$" + String.format("%.2f", totalValueinStock());
    }
}
