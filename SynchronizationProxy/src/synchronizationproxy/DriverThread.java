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
public class DriverThread extends Thread{
    private static ITable proxy= new TableProxy();
    
    public void run(){
    
        IRow r1 = new Row("L","A","H");
        IRow r2 = new Row("T","K","A");
        IRow r3 = new Row("I","L","Y");
                
        proxy.addRow(r1,(int)(1));
        System.out.println("Add-Row-1 Thread Name : " + Thread.currentThread().getName() + ", # Rows : " + proxy.numOfRows());
        proxy.addRow(r2,(int)(2));
        System.out.println("Add-Row-2 Thread Name : " + Thread.currentThread().getName() + ", # Rows : " + proxy.numOfRows());
        proxy.addRow(r3,(int)(3));
        System.out.println("Add-Row-3 Thread Name : " + Thread.currentThread().getName() + ", # Rows : " + proxy.numOfRows());
        proxy.getRow(3);
        System.out.println("Get-Row-3 Thread Name : " + Thread.currentThread().getName() + ", # Rows : " + proxy.numOfRows());
        proxy.deleteRow(3);        
        System.out.println("Delete-Row-3 Thread Name : " + Thread.currentThread().getName() + ", # Rows : " + proxy.numOfRows());
    }    
}
