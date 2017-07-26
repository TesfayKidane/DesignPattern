/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Tesfay
 */
public interface TargetStack<T> {
    
    public void push(T t);
    public T pop() throws Exception;
    public boolean isEmpty(Integer i);
    
}
