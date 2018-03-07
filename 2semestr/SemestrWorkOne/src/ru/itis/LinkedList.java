package ru.itis;

/**
 * 15.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

import java.util.Collection;
import java.util.Iterator;

public class LinkedList<T> implements List<T> {


    private class Node {
        T value;
        Node next;

        private Node(){

        }

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int count;

    public LinkedList() {

        this.count = 0;
    }


    @Override
    public T get(int index) {
        if (index >= count) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        int i = 0;

        while (i < index) {
            current = current.next;
            i++;
        }

        return current.value;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
        return true;
    }




    @Override
    public boolean add(T element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }



    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public void remove(int index) {
        Node newNode = new Node();
        newNode.next = head;
        Node current = newNode;

        int i = 0;
        while (current.next != null) {
            if (i == index) {
                current.next = current.next.next;
                break;
            }
            i++;
            current = current.next;
        }
        count--;
        head = newNode.next;

    }

    @Override
    public int size() {
       int count = 0;
        Iterator<T> iterator = this.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    private class LinkedListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.value;
            current = current.next;

            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {

        return new LinkedListIterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {}

    @Override
    public boolean remove(Object o) {
        return false;
    }
}


