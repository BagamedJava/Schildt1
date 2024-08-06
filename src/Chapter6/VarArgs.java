package Chapter6;

import java.util.Arrays;
import java.util.Comparator;



public class VarArgs {

    // Метод VaTest() допускает переменное число аргументов

    static int[] vaTest(int... v) {
        System.out.println("Кол-во аргументов: " + v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("arg " + i + ": " + v[i]);
        }
        System.out.println();
        return new int[0];
    }

    public static void main(String[] args) {
        // Метод vaTest() может вызываться с переменным числом аргументов

        vaTest(10); // 1 аргумент
        vaTest(1,2,3); // 3 аргумента
        vaTest();          // без аргументов
        vaTest(1,2,3,4,5,6,7,8,9,10);
    }
}

