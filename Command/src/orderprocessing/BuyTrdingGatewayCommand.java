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
public class BuyTrdingGatewayCommand implements ITradingGatewayCommand {

    private StockTradidngPlatform sTradingPlatform = new StockTradidngPlatform();
    private Order order;

    public BuyTrdingGatewayCommand(Order order) {
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
       sTradingPlatform.buy(order);
    }

}
