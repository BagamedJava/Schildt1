package Chapter6;

public class OverLoad {
    void OvlDemo() {
        System.out.println("Без параметров");
    }
    // Перегрузука метода OvlDemo для одного параметра типа int:

    void OvlDemo(int a) {
        System.out.println("Один параметр: " + a);
    }
    // Перегрузка метода OvlDemo для двух параметров типа int

    int OvlDemo(int a, int b) {
        System.out.println("Два параметра типа int: " + a + " и " + b);
        return a + b;
    }

    double OvlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " + a + " и " + b);
        return a + b;
    }

}

class OverloadDemo {
    public static void main(String[] args) {

        OverLoad ob = new OverLoad();
        int resI;
        double resD;

        // Поочередный вызов всех версий метода OvlDemo:


//        1.
        ob.OvlDemo();
        System.out.println();

//        2.
        ob.OvlDemo(2);
        System.out.println();

//        3.
        resI = ob.OvlDemo(4, 6);
        System.out.println("Результат вызова ob.OvlDemo(4,6): " + resI);
//        4.
        resD = ob.OvlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.OvlDemo(1.1,2.32): " + resD);

    }
}
