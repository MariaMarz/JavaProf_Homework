package homework4;
import java.util.ArrayList;
// Ознакомиться с классом ArrayList и решить задачи:
//    2.1) Вставить в него 5 элементов
//    2.2) Удалить из него 4 элемента
//    2.3) Снова вставить в него 3 элемента и найти один из элементов в этой структуре - вывести его на консоль

public class NewArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(44);
        list.add(1);
        list.add(7);
        list.add(45);

        System.out.println("Содержимое массива:");
        for (Integer element : list) {
            System.out.println(element);
        }

        list.remove(4);
        list.remove(3);
      list.remove(2);
        list.remove(1);

        System.out.println("Содержимое массива после удаления 4 элементов:");
        for (Integer element : list) {
            System.out.println(element);
        }

        list.add(99);
        list.add(97);
        list.add(109);


        Integer elementToFind = 99;
        if (list.contains(elementToFind)) {
            System.out.println("Найден элемент: " + elementToFind);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
}