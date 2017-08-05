/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.quote;

/**
 *
 * @author Tesfay
 */
public class Client {

    public static void main(String[] args) {
        StockData stockData = new StockData();
        
        //register observers; 
        new BigBuyer(stockData);
        new SmallBuyer(stockData);
        // generate changes to stock data...
        stockData.setStockData("JUPM", 16.10f, 16.15f, 15.34f,(long) 481172);
        stockData.setStockData("SUNW", 4.84f, 4.90f, 4.79f, (long) 68870233);
        stockData.setStockData("MSFT", 23.17f, 23.37f, 23.05f, (long) 75091400);
    }
}
