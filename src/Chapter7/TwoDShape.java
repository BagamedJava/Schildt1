package Chapter7;

/*
Простая иерархия классов.
Этот класс описывает двумерные объекты
 */
public class TwoDShape {
    double width;
    double height;

    void ShowDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

/*
Подкласс для представления треугольник
Этот класс - производный от класса TwoDShape
 */

class Triangle extends TwoDShape { // класс Triangle наследует класс TwoDShape
    String style;

    double area() {
        return width * height / 2;

    }

    void ShowStyle() {
        System.out.println("Треугольник " + style);
    }


}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.style = "контурный"; // Объектам типа Triangle доступны все члены класса Triangle
        t2.height = 12.0; // Даже те, которые унаследованы от класса TwoDShape
        t2.width = 8.0;
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
// Подкласс для представления прямоугольник, производный от класса TwoDShape
class Rectangle extends TwoDShape{
    boolean isSquare(){
        if (width == height) return true;
        return false;
    }
    double area(){
        return width * height;
    }
}













































