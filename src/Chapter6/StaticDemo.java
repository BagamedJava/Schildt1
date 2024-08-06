package Chapter6;

public class StaticDemo {
    int x; // обычная переменная
    static int y; // статическая переменная
    // все объекты используют одну и ту же копию статической переменной

    // Возврат суммы значений переменной экземпляра x и статической переменной y
    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();


        /*
        У каждого объекта имеется своя копия переменной экземпляра
         */
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Разумеется, ob1.x и ob2.x независимы");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        /*
        Все объекты совместно используют одну общую копию статической переменной
         */
        System.out.println("Статическая переменная y - общая");
        StaticDemo.y = 22;
        System.out.println("Присвоить StaticDemo.y значение 22");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Присвоить StaticDemo.y значение 100");
        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
    }
}