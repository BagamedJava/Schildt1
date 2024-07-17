package УпражнениеПоГлавам;

public class Bubble {
    public static void main(String[] args) {
        int[] sorting = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size = 10;
        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+sorting[i]);
        }
        System.out.println();
        // Пузырьковая сортировка
        for (a = 0; a < size; a++) {
            for (b = size - 1; b > a; b--) {
                if (sorting[b - 1] > sorting[b]) { // Если требуемый порядок
                    t = sorting[b - 1];    // следования не соблюдается
                    sorting[b - 1] = sorting[b]; // поменять элементы местами
                    sorting[b] = t;
                }
            }
        }
        System.out.print("Отображение отсортированного массива: ");
        for (int x = 0; x < size; x++) {
            System.out.print(" " + sorting[x]);
        }
    }
}
