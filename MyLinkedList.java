package lesson7.task2;


import java.util.Iterator;
import java.util.ListIterator;

public class MyLinkedList implements Iterable<String> {

    private int size;
    private Node first;
    private Node last;

    public MyLinkedList() {
    }


    public void addToHead(String value) {
        Node node = new Node(value);
       if (size == 0) {
           first = node;
           last = node;
       }else {
           node.setNext(first);
           first.setPrevious(node);
           first = node;
       }
        size++;
    }

    public void addToTail(String value) {
        Node newNode = new Node(value);
        if (size == 0) {
            first = newNode;
            last = newNode;
        }else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            builder.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        // Если лист пустой, то вернуть [B, C, A]
        // Если лист не пустой, то вернуть строку вида [AAA, BBB, CCC]
        return builder.toString();
    }

    @Override
    public ListIterator<String> iterator() {
        return new MyIterator(first, last);
    }
}