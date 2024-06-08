import task1.MyArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>();
        array.add("ab");
        array.add("ba");
        array.add("ce");
        System.out.println(array.toString());
        System.out.println(array.get(10));
        array.add("ce");
        array.add("ce");
        array.add("ce");
        array.add("ce");
        array.add("ce");
        array.add("ce");
        System.out.println(array.toString());
        array.remove(1);
        System.out.println(array.toString());
        array.remove(20);
//
//        MyArrayList<String> array2 = new MyArrayList<>();
//        array2.add("kre");
//        array2.add("fdsr");
//        array2.add("t");
//        array2.add("fre");
//
//        array.addAll(1, array2); // добвление array2 в array1 в оопределенное место
//        System.out.println("array2: " + array2.toString());
//        System.out.println("array1: " + array.toString());
//
//        array.remove(1); //удаление элемента по индексу
//        System.out.println(array);
//
//        array.sortBubble(); //сортировка пузырьком
//        System.out.println("array sorted: " + array.toString());
//
//        MyArrayList<String> array3 = new MyArrayList<>(array2); //создание списка на основе существующего
//        System.out.println("array3: " + array3.toString());
//
//        MyArrayList<String> array4 = new MyArrayList<>(array2);
//        System.out.println("not sorted: " + array4.toString());
//        MyArrayList.sortBubble(array4);
//        System.out.println("sorted: " + array4.toString());
    }

}
