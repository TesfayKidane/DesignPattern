/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizationproxy;

/**
 *
 * @author Tesfay
 */
public class Main {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           DriverThread t1 = new DriverThread();
           t1.start();
           
           DriverThread t2 = new DriverThread();
           t2.start();
           
           DriverThread t4 = new DriverThread();
           t4.start();
           
           DriverThread t3 = new DriverThread();
           t3.start();
    }
}
