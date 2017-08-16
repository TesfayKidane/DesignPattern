/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessing;

/**
 *
 * @author Tesfay
 */
public class Order {
    
    private String stockSymbol;
    private double price;
    private int quantityOfShares;
    private OrderType orderType;
    private OrderStatus orderStatus;

    public Order(String stockSymbol, double price, int quantityOfShares, OrderType orderType, OrderStatus orderStatus) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        this.quantityOfShares = quantityOfShares;
        this.orderType = orderType;
        this.orderStatus = orderStatus;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOfShares() {
        return quantityOfShares;
    }

    public void setQuantityOfShares(int quantityOfShares) {
        this.quantityOfShares = quantityOfShares;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "stockSymbol=" + stockSymbol + ", price=" + price + ", quantityOfShares=" + quantityOfShares + ", orderType=" + orderType + ", orderStatus=" + orderStatus + '}';
    }
    
}
