/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author saum
 * @param <E>
 */
public class ArrayList<E> implements List<E>, Iterable<E> {

    private class ArrayIterator implements Iterator {

        private int j = 0;

        @Override
        public boolean hasNext() {
            return j < size;
        }

        @Override
        public E next() throws NoSuchElementException {
            if (j == size) {
                throw new NoSuchElementException("No next element");
            }
            return data[j++];
        }

    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    private int size;
    private E[] data;

    public static final int CAPACITY = 10;

    public ArrayList(int Capacity) {
        data = (E[]) new Object[Capacity];
    }

    public ArrayList() {
        this(CAPACITY);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public E set(int i, E e) {
        E temp = data[i];
        data[i] = e;
        return temp;
    }

    @Override
    public E get(int i) {
        return data[i];
    }

    @Override
    public void add(int i, E e) {
            for (int z = size - 1; z >= i; z--) {
                data[z + 1] = data[z];
            }
            data[i] = e;

            size++;
    }

    @Override
    public E remove(int i) {
        E temp = data[i];
        for (int z = i; z < size - 1; z++) {
            data[z] = data[z + 1];
        }
        data[size - 1] = null;
        size--;
        return temp;
    }

}
