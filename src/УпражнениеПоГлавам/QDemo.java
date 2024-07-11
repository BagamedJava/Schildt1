package УпражнениеПоГлавам;

class Queue {
    char q[];
    int putLoc, getLoc;

    Queue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putLoc = getLoc = 0;
    }

    // Помещаем символ в очередь
    void put(char ch) {
        if (putLoc == q.length) {
            System.out.println(" - очередь заполнена");
            return;
        }
        q[putLoc++] = ch;

    }

    char get() {
        if (getLoc == putLoc) {
            System.out.println(" - очередь пуста");
            return (char) 0;
        }
        return q[getLoc++];
    }
}

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // Извлечение и отображение буквенных символов из очереди bigQ

        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        // Доп. ошибки при обращении к очереди smallQ
        System.out.println("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch!=(char) 0) System.out.print(ch);
        }
    }
}