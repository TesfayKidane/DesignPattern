/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.List;

/**
 *
 * @author Tesfay
 */
public class LinkedListProfileDecorator<E> extends ProfileDecorator<E> {

    public LinkedListProfileDecorator(List list) {
        super(list);
    }

    @Override
    public boolean add(E e) {
        long start = System.nanoTime();
        boolean addResult = super.add(e);
        System.out.println("LinkedList add " + (System.nanoTime() - start));
        return addResult;
    }

    @Override
    public boolean remove(Object o) {
        long start = System.nanoTime();
        boolean removeResult = super.remove(o);
        System.out.println("LinkedList remove " + (System.nanoTime() - start));
        return removeResult;
    }

    @Override
    public boolean contains(Object o) {
        long start = System.nanoTime();
        boolean containsResult = super.contains(o);
        System.out.println("LinkedList contains " + (System.nanoTime() - start));
        return containsResult;
    }

    @Override
    public int size() {
        long start = System.nanoTime();
        int sizeResult = super.size();
        System.out.println("LinkedList size " + (System.nanoTime() - start));
        return sizeResult;
    }

}
