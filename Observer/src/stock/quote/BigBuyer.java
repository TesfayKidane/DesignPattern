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
public class BigBuyer implements Observer {

    private String symbol;
    private float close;
    private float high;
    private float low;
    private long volume;

    public BigBuyer(Subject stockData) {
        stockData.register(this);
    }

    @Override
    public void update(String symbol, float close, float high, float low, long volume) {
       this.symbol = symbol;
       this.close = close;
       this.high = high;
       this.low = low;
       this.volume = volume;
       display();
    }
    
    public void display(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "BigBuyer{" + "symbol=" + symbol + ", close=" + close + ", high=" + high + ", low=" + low + ", volume=" + volume + '}';
    }
    
    

}
