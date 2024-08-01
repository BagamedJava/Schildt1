package Chapter6;

public class FailSoftArray {
    private int[] a;     // Ссылка на массив значение, возвращаемся в случае
    private int errval;  // возникновения ошибки при выполненнии метода get()

    public int length; // открытая переменная

    /*
    конструктору данного класса передаются размер массива
    и значение, которое должен возвращать метод get() при
    возникновении ошибки
     */

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    // озврат значения элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index)) return a[index];
        return errval;
    }

    //Установка значения элемента с заданным индексом.
    // Если возникнет ошибка, вернуть логическое значение false.

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // озврат логического значения true, если индекс не выходит за переделы массива.
    private boolean indexOK(int index) {
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }
}

class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.print("Обработка ошибок без вывода отчета.");

        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }

        //Обработка ошибок
        System.out.print("\nОбработка ошибок с выводом отчета. ");
        for (int i = 0; i < (fs.length * 2); i++){
            if (!fs.put(i,i*10)){
                System.out.println("Индекс: " + i + "Вне допустимого диапозона");
            }
        }
        for (int i = 0; i < (fs.length * 2); i++) {
        x = fs.get(i);
        if (x!= -1) System.out.println(x + " ");
        else System.out.println("Индекс " + i + " вне допустимого значения");
        }
    }
}