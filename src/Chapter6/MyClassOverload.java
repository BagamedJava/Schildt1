package Chapter6;

public class MyClassOverload {
    int x;

    MyClassOverload() {
        System.out.println("Внутри MyClassOverload().");

        x = 0;
    }

    MyClassOverload(int i) {
        System.out.println("Внутри MyClassOverload().");
        x = i;
    }

    MyClassOverload(double d) {
        System.out.println("Внутри MyClassOverload().");
        x = (int) d;
    }
    MyClassOverload(int i, int j){
        System.out.println("Внутри MyClassOverload().");
        x = i * j;
    }
}
class OverLoadConsDemo{
    public static void main(String[] args) {
        MyClassOverload t1 = new MyClassOverload();
        MyClassOverload t2 = new MyClassOverload(88);
        MyClassOverload t3 = new MyClassOverload(17.23);
        MyClassOverload t4 = new MyClassOverload(2,4);

        // Вывод:
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);


    }
}
