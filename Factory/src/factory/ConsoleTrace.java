/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Tesfay
 */
public class ConsoleTrace implements Trace{
    private boolean debugMode = false;
    

    @Override
    public void setDebug(boolean debug) {
       this.debugMode = debug;
    }

    @Override
    public void debug(String msg) {
        if(debugMode)
            System.out.println("Writting " + msg + " to file.");
        else
            System.out.println("Set debug mode to true first.");
    }

    @Override
    public void error(String msg) {
        System.out.println("Error during consule debug trace");
    }
    
}
