package entities;

public class Product {

    private String name;
    private double price;
    //A quantidade nunca sera alterada, deve ter um valor seguindo a regra de negocio.
    private int quantity;

    //Sobrecarga de construtor completo
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Sobrecarga de construtor com atributos reduzidos
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueinStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

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

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product: " + "Name = " + name + ", Price = R$" + String.format("%.2f", price) + ", Quantity = " + quantity + " units, Total: R$" + String.format("%.2f", totalValueinStock());
    }
}
