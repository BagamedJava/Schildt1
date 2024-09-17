package HomeWork.CH7;

public class TwoDShape {
    // 1. Имеет ли суперкласс доступ к членам подкласса?
    // Нет, не имеет.
    // Имеет ли подкласс доступ к членам суперкласса?
    // Да, подкласс имеет доступ к членам суперкласса, если они не имеют модиф. доступа private. Если у них такой доступ, то нужно использовать геттеры\сеттеры


    /* 2. Создайте подкласс Circle,производный от класса TwoDShape
    В подклассе должен быть определен метод area();, который вычисляет
    площадь круга, а также конструктор, с ключевымы словом super для иницииализации членов,
    которые унаследованы от класса TwoDShape
     */

    private double radius;

    public final double PI = 3.14159;


    double getRadius() {
        return radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double area() {
        return radius * radius * PI;
    }


    TwoDShape(double r) {
        this.radius = r;
    }

    void ShowInfo() {
        System.out.println("Площадь круга составляет: " + area());
    }
}

class Circle extends TwoDShape {
    Circle(double r) {
        super(r);
    }

    public static void main(String[] args) {
        Circle plosh = new Circle(3);
        Circle plosh1 = new Circle(4);
        plosh.ShowInfo();
        plosh1.ShowInfo();
    }
}
/*
3. Как предотвратить обращение к членам суперкласса из подкласса?
С помощью final
 */
/*
4. Опишите назначение и два варианта использования ключ.слова super
Нужно, чтобы создать конструктор в другом классе, который наследован от суперкласса
При использовании методов
 */
// 5. Сверху вниз, сначала вызывается конструктор альфа, далее бета, далее гамма

