package Chapter7;

public class TwoDShape2 {
    private double width; // Теперь эти переменные
    private double height; // объявлены как закрытые

    // Методы доступа к закрытым переменным экземпляра width и height:
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

/*
подкласс для представления треугольников
производный от класса TwoDShape2
 */
class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void ShowStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        t1.setHeight(4.0);
        t1.setWidth(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";


        System.out.println("Информация о t1: ");
        t1.ShowStyle();
        t1.ShowDim();
        System.out.println("Площадь - " + t1.area());
        System.out.println();

        System.out.println("Информация о t2: ");
        t2.ShowStyle();
        t2.ShowDim();
        System.out.println("Площадь - " + t2.area());
    }
}