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
public class CancelTradingGatewayCommand implements ITradingGatewayCommand{

    private StockTradidngPlatform sTradingPlatform = new StockTradidngPlatform();
    private Order order;

    public CancelTradingGatewayCommand(Order order) {
        this.order = order;
    }

    public StockTradidngPlatform getsTradingPlatform() {
        return sTradingPlatform;
    }

    public void setsTradingPlatform(StockTradidngPlatform sTradingPlatform) {
        this.sTradingPlatform = sTradingPlatform;
    }
    
    @Override
    public void execute() {
       if(sTradingPlatform.getOrderStatus(order).equals(OrderStatus.NOT_FULL_FILLED)){
           sTradingPlatform.cancel(order);
           
       }
       
    }
    
}
