/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Client {
    public static void main(String[] args){
      
        List<Integer> aListProfiler = new ArrayListProfileDecorator<>(new ArrayList());
        aListProfiler.add(100);
        aListProfiler.add(200);
        aListProfiler.add(300);
        aListProfiler.add(400);
        aListProfiler.add(500);
        
        aListProfiler.remove(0);
        aListProfiler.contains(100);
        aListProfiler.size();
        
        List<Integer> lListProfiler = new LinkedListProfileDecorator<>(new LinkedList());
        
        lListProfiler.add(100);
        lListProfiler.add(200);
        lListProfiler.add(300);
        lListProfiler.add(400);
        lListProfiler.add(500);
        
        lListProfiler.remove(0);
        lListProfiler.contains(100);
        lListProfiler.size();
    }
}
