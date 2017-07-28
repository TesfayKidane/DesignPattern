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
public class SimpleTraceFactory implements TraceFactory{

    public static SimpleTraceFactory stf = new SimpleTraceFactory();
    
    private SimpleTraceFactory(){
    }
    
    public static TraceFactory getTraceFactory(){
        return stf;
    }
    
    @Override
    public Trace createTrace(String traceType) {
        
        if(traceType.equalsIgnoreCase("FILE")){
            return new FileTrace();
        }       
        else if(traceType.equalsIgnoreCase("CONSOLE"))
        {
            return new ConsoleTrace();
        }
        else
        {
             throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
    
    
}
