package Chapter7;
/*
исполдьзование методов доступя для установки и
получения значений закрытых членов.
 */

// Класс, описывающий двумерные объекты
public class TwoDShape2 {
    private double width; // теперь эти переменные
    private double height; // объявлены как закрытые


    // Методы доступа к закрытым переменным экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        this.width = w;
    }

    void setHeight(double h) {
        this.height = h;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

}

// подкласс для представления треугольник, производный от класса TwoDShape
class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        return getWidth() * getHeight() / 2; // использование методов доступа предоставляемых суперклассом
    }
    void showStyle(){
        System.out.println("Треугольник " + style);
    }

}
class Shape2{
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();


        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "закрашенный";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());
        System.out.println();
        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());




















    }
}
