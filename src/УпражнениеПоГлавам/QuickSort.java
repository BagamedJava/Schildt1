package УпражнениеПоГлавам;

import java.util.Arrays;

public class QuickSort {
    static void qsort(char items[]) { // Вызов метода быстрой сортировки
        qs(items, 0, items.length - 1);
    }

    // Рекурсивная версия метода быстрой сортировки символов:
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) qs(items, left, j);
        if (i < right) qs(items, right, j);
    }
}

class QSDemo {
    public static void main(String[] args) {

        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

        System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("Отсортированный массив: ");

        for (int b = 1; b < a.length; b++) {
            System.out.print(a[b]);
        }

    }
}
