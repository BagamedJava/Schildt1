//package HomeWork;
//
//public class Chapter6_ex3 {
//    private char q[]; // Массив для хранения элементов очереди
//    private int pushloc,poploc; // Индексы для вставки и извлечения элементов очереди.
//
//    Chapter6_ex3(int size) {
//        q = new char[size]; // выделение памят для очереди
//        poploc = pushloc = 0;
//    }
//void push(char ch){
//
//}
//    void put(char ch) {
//        if (putloc == q.length) {
//            System.out.println(" - очередь заполнена");
//            return;
//        }
//        q[putloc++] = ch;
//
//    }
//
//    char get() {
//        if (getloc == putloc) {
//            System.out.println("- Очередь пуста");
//            return (char) 0;
//        }
//        return q[getloc++];
//    }
//}
//class Ch6Test{
//
//    public static void main(String[] args) {
//        Chapter6_ex3 ch1 = new Chapter6_ex3(10);
//    }
//}