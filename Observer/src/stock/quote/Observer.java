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
public interface Observer {
    public void update(String symbol, float close, float high, float low, long volume);
}
