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
public class SmallBuyer implements Observer {

    private String symbol;
    private float close;

    public SmallBuyer(Subject stockData){
        stockData.register(this);
    }
    @Override
    public void update(String symbol, float close, float high, float low, long volume) {
        this.symbol = symbol;
        this.close = close;     
        display();
    }
    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "SmallBuyer{" + "symbol=" + symbol + ", close=" + close + '}';
    }
}
