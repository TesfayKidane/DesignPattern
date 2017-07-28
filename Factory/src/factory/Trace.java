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
public interface Trace {

    public void setDebug(boolean debug);
    public void debug(String msg);
    public void error(String msg);
    
}
