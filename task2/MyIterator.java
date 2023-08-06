package lesson7.task2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyIterator implements ListIterator<String> {
    private  Node current;
    private Node last;
    public MyIterator(Node current, Node last) {
        this.current = current;
        this.last = last;
    }


    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public String next() {
        if (current == null){
            throw  new NoSuchElementException();
        }
        String value = current.getValue();
        current = current.getNext();
        return value;
    }

    @Override
    public boolean hasPrevious() {
        return current != null && current.getPrevious() != null;
    }

    @Override
    public String previous() {
        if (current == null || current.getPrevious() == null) {
            throw new NoSuchElementException();
        }
        String value = current.getValue();
        current = current.getPrevious();
        return value;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(String s) {

    }

    @Override
    public void add(String s) {

    }
}
