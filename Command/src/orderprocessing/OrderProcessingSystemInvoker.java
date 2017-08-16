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
public class OrderProcessingSystemInvoker {
    
    private final ITradingGatewayCommand buyTradingGatewayCommand;
    private final ITradingGatewayCommand cancelTradingGatewayCommand;
    private final ITradingGatewayCommand sellTradingGatewayCommand;

    public OrderProcessingSystemInvoker(ITradingGatewayCommand buyTradingGatewayCommand, ITradingGatewayCommand cancelTradingGatewayCommand, ITradingGatewayCommand sellTradingGatewayCommand) {
        this.buyTradingGatewayCommand = buyTradingGatewayCommand;
        this.cancelTradingGatewayCommand = cancelTradingGatewayCommand;
        this.sellTradingGatewayCommand = sellTradingGatewayCommand;
    }
    
    public void buy(){
        buyTradingGatewayCommand.execute();
    }
    
    public void sell(){
        sellTradingGatewayCommand.execute();
    }
    
    public void cancel(){
        cancelTradingGatewayCommand.execute();
    }
    
}
