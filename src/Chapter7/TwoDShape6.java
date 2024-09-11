package Chapter7;

public class TwoDShape6 {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию:
    TwoDShape6() {
        width = height = 0.0;
        name = "none";
    }

    //Параметизированный конструктор
    TwoDShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Создание объекта с одинаковыми значениями переменных экземплеря высота и ширина
    TwoDShape6(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // методы доступа к переменным width и height
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

    String getName() {
        return name;
    }

    void ShowDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    // метод area() определенный классом TwoDShape6
    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}

class Triangle6 extends TwoDShape6 {
    // Подкласс для представления треугольник
    // производный от класса TwoDShape6

    private String style;

    // Конструктор по умолчанию
    Triangle6() {
        super();
        style = "none";
    }

    // Конструктор класса Triangle6
    Triangle6(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // конструктор с одним аргументом для построения треугольника
    Triangle6(double x) {
        super(x, "треугольник"); // Вызов конструктора суперкласса
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangle6(Triangle6 ob) {
        super(ob); // передача объета конструктора класса TwoDShape6
        style = ob.style;
    }

    // переопределение метода area() для класса Triangle
    double area() {
        return getHeight() * getWidth() / 2;
    }

    void ShowStyle() {
        System.out.println("Треугольник " + style);
    }
}

//Подкласс для преставления прямоугольник, производным от класса TwoDShape
class Rectangle6 extends TwoDShape6 {
    // Конструктор по умолчанию
    Rectangle6() {
        super();
    }

    //Конструктор класса Rectangle6
    Rectangle6(double w, double h) {
        super(w, h, "прямоугольник"); // Вызов конструктора суперкласса
    }

    // Создание квадрата
    Rectangle6(double x) {
        super(x, "прямоугольник"); // Вызов конструктора суперкласса
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Переопределение метода area() для класса Rectangle6
    double area() {
        return getHeight() * getWidth();
    }
}

class DynShapes {
    public static void main(String[] args) {
        TwoDShape6 shapes[] = new TwoDShape6[5];
        shapes[0] = new Triangle6("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle6(10);
        shapes[2] = new Rectangle6(10, 4);
        shapes[3] = new Triangle6(7.0);
        shapes[4] = new TwoDShape6(10,20,"фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();

        }


    }
}