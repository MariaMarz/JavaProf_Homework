package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static Scanner scanner = new Scanner(System.in);              // Объект для чтения ввода пользователя
    public static Random random = new Random();                          // Создаю глобальный объект для генерации случайных чисел

    public static void main(String[] args) {                             // Точка входа. В Java всегда исполнение программы начинается отсюда
        /*
        Задача
        Есть необходимость получать данные от пользователя и сохранять их в массив. Данные типа double
        Решение
        Организуем ввод чисел в бесконечном цикле.
         */

//        ArrayList<Double> array = new ArrayList<>();           // Создаем массив типа double
//        while (true){                                           // Пользовательский цикл. Для запроса чисел
//          System.out.println("Введите число: ");                // Приглашаем ввести число
//          double input = scanner.nextInt();                        // Считываем ввод
//          array.add(input);                                     // Добавляем элемент в массив
//          System.out.println("Массив: ");
//          System.out.println(array);                            // Выводим массив на консоль
//        }

        /*
        Задача
        Заполнить массив произвольными данными типа int и отсортировать его
        Решение
        Создадим объект класса ArrayList, создадим глобальную переменную Random(смотреть вверху)
         */

        ArrayList<Double> arrayList = new ArrayList<>();

        for (double i = 0; i < 15; i++) {                       // В цикле создаем 15 случайных чисел в диапазоне до 50 и добавляем их в массив
            arrayList.add(random.nextDouble(50));
        }

        System.out.println("Неупорядоченный массив: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Упорядоченный массив: " + arrayList);

       /*
       Задача
       Реализовать класс для обработки массивов(своя версия ArrayList)
       Решение класс ArrayWorking
        */

        ArrayWorking2 arrayWorking = new ArrayWorking2();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление элемента из массива: ");
        arrayWorking.deleteElement();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление массива: ");
        arrayWorking.deleteArray();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.erase();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();

        arrayWorking.erase();      // Исправляем вред от взлома - приводим массив к текущему состоянию
        arrayWorking.add(14);
        arrayWorking.add(17);
        System.out.println("Второе число: " + arrayWorking.get(1));

    }

}


