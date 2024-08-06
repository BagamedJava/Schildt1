package Chapter6;

public class VarArgs2 {
    // здесь msg - обычный параметр
    // v - массив парамертров переменной длинны

    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Три аргумента в массиве: ", 1,2,3);
        vaTest("Семь аргументов в массиве: ", 1,2,3,4,5,6,7);
    }
}
