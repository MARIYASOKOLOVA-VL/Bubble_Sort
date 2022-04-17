package com.company;

public class Array_Bubble_Sort {

    private int arr[];
    private int elem;

    public Array_Bubble_Sort(int size){ // конструктор
        arr = new int[size];
        elem = 0;
    }

    // либо пользователь заполняет массив вручную, либо проделывает это автоматически при помощи метода insert_random()

    public void insert(int value){ // вставка элементов
        arr[elem] = value;
        elem++;
    }

    public void insert_random(){ // автоматическое заполнение массива числами от -100 до 100
        for (int i = 0; i < 100; i++){
            int random_value = (int)(Math.random()*(200 + 1)) - 100;
            arr[elem] = random_value;
            elem++;
        }
    }

    public void print_arr(){ // вывод
        for (int i = 0; i < elem; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void bobble_S(){ // пузырьковая сортировка
        for (int j = elem-1; j > 1; j=j-1){
            for (int i = 0; i < j; i ++){
                if (arr[i] > arr[i+1]){
                    int c= 0;
                    c = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=c;
                }
            }
        }
    }
}
