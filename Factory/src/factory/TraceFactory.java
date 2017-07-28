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
public interface TraceFactory {
    public Trace createTrace(String traceType);
}
