package УпражнениеПоГлавам;

public class Queue {

    char q[]; // Массив для хранения элементов очереди
    int putloc, getloc; // Индексы для вставки и извлечения элементов очереди.

    Queue(int size) {
        q = new char[size]; // выделение памят для очереди
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - очередь заполнена");
            return;
        }
        q[putloc++] = ch;

    }

    char get() {
        if (getloc == putloc) {
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Использование очереди bigQ ля сохранения алфавита");
        // помещение буквенных символов в очередь bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        // извлечение и отображение символов из очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        // Генерация ошибок в smallQ
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения: " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch!=(char) 0) System.out.print(ch);
        }
    }
}
