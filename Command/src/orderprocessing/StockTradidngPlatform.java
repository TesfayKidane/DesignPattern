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
public class StockTradidngPlatform {

    public void buy(Order order) {
        System.out.println("Stock Trading Platform Received Buy Order");
    }

    public void sell(Order order) {
        System.out.println("Stock Trading Platform Received Sell Order");
    }

    public void cancel(Order order) {
        System.out.println("Stock Trading Platform Received Cancel Order");
    }

    public OrderStatus getOrderStatus(Order order) {
        return order.getOrderStatus();
    }

    public void setOrderStatus(Order order, OrderStatus orderStatus) {
        order.setOrderStatus(orderStatus);
    }
}
