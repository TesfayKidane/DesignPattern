/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tesfay
 */
public class Client {
    
    public static void main(String[] args){
        TargetQueue<Integer> tq = new QueueStackAdapter<>();
        TargetStack<Integer> ts = new QueueStackAdapter<>();
        tq.enqueue(1);
        tq.enqueue(2);
        System.out.println(tq.isEmpty(2));
        
        
        ts.push(3);
        ts.push(6);
        ts.push(9);
        try {
            ts.pop();
            ts.pop();
            ts.pop();
            ts.pop();
        } catch (Exception ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(ts.isEmpty(1));
    }
}
