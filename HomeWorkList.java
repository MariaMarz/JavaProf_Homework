import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HomeWorkList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10000000 ; i++) {
            myList.add(i);
        }
        System.out.println("Перебираю с for-each: ");
        long startTime = System.currentTimeMillis();
        for (Integer temp : myList) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения for-each: " + (endTime - startTime) + "мс");

        System.out.println("Перебираю с for: ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < myList.size() ; i++) {
            Integer temp = myList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения for: " + (endTime - startTime) + "мс");


        System.out.println("Перебираю с for и отдельную переменную испльзую: ");
        int myListSize = myList.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < myListSize ; i++) {
            Integer temp = myList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения for с отдельной переменной: " + (endTime - startTime) + "мс");

        System.out.println("Перебираю с конца до начала: ");
        startTime = System.currentTimeMillis();
        for (int i = myListSize - 1; i >= 0; i--) {
            Integer temp = myList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения for с конца до начала: " + (endTime - startTime) + "мс");

        System.out.println("Перебираю с помощью Iterator: ");
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения Iterator: " + (endTime - startTime) + "мс");

        System.out.println("Перебираю с помошью ListIterator: ");
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            Integer temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения ListIterator: " + (endTime - startTime) + "мс");
        }
    }
