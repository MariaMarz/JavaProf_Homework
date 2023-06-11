package homework.Homework2;

import java.util.Arrays;

public class Task {
    // 1) Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве и выводит результат.

//    public static int sum(int[] num) {
//        int result = 0;
//        for (int i = 0; i < num.length; i++) {
//            result = result + num[i];
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {9, 7, 2, 8};
//        System.out.println(sum(array));
//    }
//}

// 2) Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой и выводит результат.

//    public static void main(String[] args) {
//        double[] arr = {5.4, 4.8, 1.2, 8.6};
//        double result = 0;
//        for (double n : arr) {
//            result += n;
//
//        }
//        System.out.println("Среднее арифметическое значение равно " + result / arr.length);
//    }
//}

    // 3) Напишите программу на Java, которая находит наименьший и наибольший элементы в целочисленном массиве и выводит их значения.
//    public static void main(String[] args) {
//        int[] numbers = {3, 7, 4, 9, 11, 15};
//
//        int min = getMin(numbers);
//        int max = getMax(numbers);
//
//        System.out.println("Наименьший элемент в массиве: " + min);
//        System.out.println("Наибольший элемент в массиве: " + max);
//
//    }
//
//    public static int getMin(int[] num) {
//        int min = num[0];
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] < min) {
//                min = num[i];
//            }
//        }
//        return min;
//    }
//
//    public static int getMax(int[] num){
//        int max = num[0];
//        for (int i = 0; i < num.length ; i++) {
//            if (num[i]> max) {
//                max = num[i];
//            }
//        }
//        return max;
//    }
//}

// 4) Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве и выводит результат.
//public static void main(String[] args) {
//    int[] array = {-2, 45, 23, -56, -1, 2};
//
//    int count = countNegativeElem(array);
//    System.out.println("Количсетво отрицательных элкментов равно " + count);
//}
//
//public static int countNegativeElem(int[] arr){
//int count = 0;
//    for (int i = 0; i < arr.length ; i++) {
//        if (arr[i] < 0){
//            count++;
//        }
//    }
//    return count;
//}
//}

    // 5) Напишите программу на Java, которая находит индекс первого вхождения заданного элемента в строковом массиве и выводит его значение.
//    public static void main(String[] args) {
//        String[] names = {"Maria", "Anna", "Catalina", "Felix", "Kate" };
//        String element = "Maria";
//        int index = getIndex(names, element);
//        if (index != -1) {
//            System.out.println("Индекс первого вхождения элемента " + element + " " + index);
//            System.out.println("Значение элемента: " + names[index]);
//        }
//    }
//
//    public static int getIndex(String[] names, String element) {
//        for (int i = 0; i < names.length; i++) {
//            if (names[i].equals(element)) {
//               return i;
//            }
//        }
//        return -1;
//
//    }
//}
// 6) Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).

// К сожалениею, мы не проходили метод merge sort...

    // 7) Напишите программу на Java, которая находит наиболее часто встречающийся элемент в целочисленном массиве и выводит его значение.
    // 8) Напишите программу на Java, которая объединяет два отсортированных целочисленных массива в один отсортированный массив, используя алгоритм слияния (merge).
    // 9) Напишите программу на Java, которая находит наибольшую возрастающую последовательность в целочисленном массиве и выводит ее значения.
    // 10) Напишите программу на Java, которая находит пару элементов в целочисленном массиве, сумма которых равна заданному числу, и выводит их значения.

    // 1) Задача 1.
    // Напишите программу на Java для создания класса "Студент" (Student), который будет иметь следующие свойства:
    //Имя (name) - строка;
    //Возраст (age) - целое число;
    //Средний балл (averageGrade) - вещественное число.
    //Класс "Студент" должен иметь конструкторы для инициализации объекта с именем и возрастом или с именем, возрастом и средним баллом. Также класс должен иметь методы для установки и получения значений свойств.
    //В главном классе программы создайте несколько объектов класса "Студент" и продемонстрируйте их использование, например, выведя информацию о студентах на экран.
    public static class Student {
        private String name;
        private int age;
        private double averageGrade;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student(String name, int age, double averageGrade) {
            this.name = name;
            this.age = age;
            this.averageGrade = averageGrade;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void studentInfo() {
            System.out.println("Имя: " + name);
            System.out.println("Возраст: " + age);
            System.out.println("Средний балл: " + averageGrade);
            System.out.println();
        }
    }

        public static void main(String[] args) {
            Student student1 = new Student("Maria", 31, 4.2);
            student1.studentInfo();

            Student student2 = new Student("Alex", 29, 3.9);
            student2.studentInfo();
            
        }
    }
