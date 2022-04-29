package entities;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    //Aqui é chamado a classe OrderItem e faz uma iteraçao para obter o subtotal de cada linha
    public Double total() {
        double valorItens = 0;
        for (OrderItem orderItems : items) {
            valorItens += orderItems.subTotal();
        }
        return valorItens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status.toString() + "\n");
        sb.append(client.toString() + "\n");
        sb.append("Order items: \n");
        for (OrderItem orderItem : items) {
            sb.append(orderItem.toString() + "\n");
        }
        sb.append("Total price: " + String.format("%.2f", total()) + "\n");
        return sb.toString();
    }
}
