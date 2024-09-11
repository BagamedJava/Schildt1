package Chapter7;

// Многоуровневая иерархия
public class TwoDShape5 {
    private double width;
    private double height;

    // Конструктор по умолчанию
    TwoDShape5() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDShape5(double x) {
        width = height = x;
    }

    // Методы доступа к переменным экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void ShowDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

}

// расширение класса TwoDShape5
class Triangle5 extends TwoDShape5 {
    private String style;

    // Конструктор по умолчанию
    Triangle5() {
        super();
        style = "none";
    }

    Triangle5(String s, double w, double h) {
        super(w, h); // вызов конструктора суперкласса
        style = s;
    }

    // конструктор с одним аргументом для построения треугольника
    Triangle5(double x) {
        super(x); // вызов конструктора суперкласса
        style = "закрышенный";
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void ShowStyle() {
        System.out.println("Треугольник " + style);
    }
}

// Расширение класса Triangle5
class ColorTriangle extends Triangle5 {
    /*
    Класс ColorTriangle наследует класс Triangle5, производный от класса TwoDShape5,
    и поэтому включает все члены классов Triangle5 и TwoDShape5
     */
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void ShowColor() {
        System.out.println("Цвет - " + color);
    }
}

class Shapes5 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация о t1: ");
        t1.ShowStyle();
        t1.ShowDim();
        t1.ShowColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.ShowStyle();
        t2.ShowDim();
        t2.ShowColor();
        System.out.println("Площадь - " + t2.area());


    }
}