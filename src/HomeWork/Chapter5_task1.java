package HomeWork;

import java.util.Arrays;

public class Chapter5_task1 {
    public static void main(String[] args) {
        /*
        1. Продемонстрируйте два способа объявления
        одномерного массива,
        состоящего из 12 элементов типа double.

         */

        double[] array = {1.0, 1.1, 1.2, 1.3};
        double[] array1 = new double[5];
        array1[0] = 1.4;
        array1[1] = 1.5;
        array1[2] = 1.6;
        array1[3] = 1.7;
        array1[4] = 1.8;

        /*
       2. Покажите, как инициализировать одномерный массив целочисленными
значениями от 1 до 5.
         */

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

/*
3. Напишите программу, в которой массив используется для нахождения
среднего арифметического десяти значений типа double.
Используйте любые десять чисел.
 */
        double[] sred = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double sredArith = 0.0;
        for (double x : sred) {

            sredArith += x;
        }
        System.out.println(sredArith / sred.length);

        /*
        4. Измените программу, написанную в упражнении 5.1, таким образом,
        чтобы она сортировала массив строк. Продемонстрируйте ее работоспособность
         */
String[] str = {"Уж","Зов","Искра","Лук","Нос","Огонь","Спор","Тон","Ров"};
String changer;
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        // СПС ГУГЛУ!:) Зачитерил?:(

        /*
          9. Переписать используя "?"
          if(x<0) y = 20;
          else y = 20;

         */

        }
    }


