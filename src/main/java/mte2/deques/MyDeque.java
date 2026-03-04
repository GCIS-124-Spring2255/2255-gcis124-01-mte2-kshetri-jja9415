// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Iterator;


public class MyDeque<E> implements Deque<E> {
    private final LinkedList<E> list;
    public MyDeque() {
        list = new LinkedList<>();
    }
    @Override
    public void enqueueFront(E element) {
        list.addFirst(element);
    }
    @Override
    public void enqueueBack(E element) {
        list.addLast(element);
    }
    @Override
    public E dequeueFront() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Deque is empty"); // i totally forgot what we used in class i think this 
                                                                   //counts as outside code but i dont know what else to use
        }
        return list.removeFirst();
    }
    @Override
    public E dequeueBack() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return list.removeLast();
    }
    @Override
    public int size() {
        return list.size();
    }
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
    public static void main(String[] args) {
        MyDeque<Integer> deque = new MyDeque<>();

        deque.enqueueFront(10);
        deque.enqueueBack(20);
        deque.enqueueFront(5);

        System.out.println("Size: " + deque.size()); // 3

        for (Integer num : deque) {
            System.out.println(num);
        }

        System.out.println("Removed front: " + deque.dequeueFront());
        System.out.println("Removed back: " + deque.dequeueBack());
        System.out.println("Size: " + deque.size());
    }
}