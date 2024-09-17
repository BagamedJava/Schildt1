package Chapter7;

abstract class TwoDShap {
    // Он абстрактный
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    TwoDShap() {
        width = height = 0.0;
        name = "none";
    }

    // Параметризированный констуктор
    TwoDShap(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShap(double x, String n) {
        width = height = x;
        name = n;
    }

    // Создание одного объекта на основе другого
    TwoDShap(TwoDShap ob) {
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

    // Теперь метод area() абстрактный:
    abstract double area();
}

//Подкласс для представления треугольников
// производный от абстрактного класса TwoDShap
class Triangl extends TwoDShap {
    private String style;

    //Конструктор по умолчанию
    Triangl() {
        super();
        style = "none";
    }


    // Конструктор класса Triangle6
    Triangl(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }

    // конструктор с одним аргументом для построения треугольника
    Triangl(double x) {
        super(x, "треугольник"); // Вызов конструктора суперкласса
        style = "закрашенный";
    }

    // Создание одного объекта на основе другого
    Triangl(Triangl ob) {
        super(ob); // передача объета конструктора класса TwoDShape6
        style = ob.style;
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangl extends TwoDShap {
    // Конструктор по умолчанию
    Rectangl() {
        super();
    }

    //Конструктор класса Rectangle6
    Rectangl(double w, double h) {
        super(w, h, "прямоугольник"); // Вызов конструктора суперкласса
    }

    // Создание квадрата
    Rectangl(double x) {
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

class AbsShape {
    public static void main(String[] args) {
        TwoDShap[] shapes = new TwoDShap[4];

        shapes[0] = new Triangl("контурный", 8.0, 12.0);
        shapes[1] = new Rectangl(10);
        shapes[2] = new Rectangl(10, 4);
        shapes[3] = new Triangl(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();

        }

    }
}