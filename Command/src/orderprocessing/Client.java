/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessing;

import orderprocessing.domain.Order;
import orderprocessing.domain.OrderStatus;
import orderprocessing.domain.OrderType;
import orderprocessing.command.BuyTrdingGatewayCommand;
import orderprocessing.command.CancelTradingGatewayCommand;
import orderprocessing.command.SellTradingGatewayCommand;
import orderprocessing.command.ITradingGatewayCommand;

/**
 *
 * @author Tesfay
 */
public class Client {
    
    public static void main(String[] args){
    
        Order order = new Order("ASD", 9.99, 100, OrderType.BUY, OrderStatus.CANCELED);
                
        ITradingGatewayCommand buyCommand = new BuyTrdingGatewayCommand(order);
        ITradingGatewayCommand sellCommand = new SellTradingGatewayCommand(order);
        ITradingGatewayCommand cancelCommand = new CancelTradingGatewayCommand(order);
        
        OrderProcessingSystemInvoker invoker = new OrderProcessingSystemInvoker(buyCommand, cancelCommand, sellCommand);
        
        switch (order.getOrderType()) {
            case BUY:
                invoker.buy();
                break;
            case CANCEL:
                invoker.cancel();
                break;
            case SELL:
                invoker.sell();
                break;
            default:
                break;
        }
    
    
    }
}
