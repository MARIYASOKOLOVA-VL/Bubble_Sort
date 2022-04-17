package com.company;

public class Main {

    public static void main(String[] args) {

        int size = 100; // указываем размер
        Array_Bubble_Sort my_arr = new Array_Bubble_Sort(size); // создаём массив

        //my_arr.insert(5); // заполняем массив вручную
        //my_arr.insert(10);
        //my_arr.insert(-4);
        //my_arr.insert(53);
        //my_arr.insert(1);
        //my_arr.insert(2);
        //my_arr.insert(-25);
        //my_arr.insert(-100);

        my_arr.insert_random(); // заполняем массив автоматически

        System.out.println("Изначальный массив: ");
        my_arr.print_arr();
        my_arr.bobble_S();
        System.out.println("Отсортированный массив: ");
        my_arr.print_arr();
    }
}
