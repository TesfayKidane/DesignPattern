/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Stack;

/**
 *
 * @author Tesfay
 */
public class QueueStackAdapter<T> implements TargetQueue<T>, TargetStack<T>{

    private Stack<T> stack = new Stack<>();
    private ArrayQueue<T> queue = new ArrayQueue<T>();
    
    @Override
    public void enqueue(T t) {
        queue.enqueue(t);
    }

    @Override
    public T dequeue() throws Exception{
        if(!queue.isEmpty()){
        return queue.dequeue();}
        else{
            throw new Exception("Queue is empty");
        }
    }

    @Override
    public boolean isEmpty(Integer i) {
       if(i.equals(1)){
           return stack.isEmpty();
       }
       
       else if(i.equals(2)){
           return queue.isEmpty();
       }
       
       return true;
    }

    @Override
    public void push(T t) {
        stack.push(t);
    }

    @Override
    public T pop() throws Exception {
        if(!stack.isEmpty()){
            return stack.pop();
    }
        else{
            throw new Exception("Stack is empty");
        }
    }
    
}
