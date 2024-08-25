package Chapter7;

/*
Простай иерархия классов
Класс, который описывает двумерные объекты:
 */public class TwoDShape {
    double width;
    double height;

    void ShowDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

//Подкласс для представления треугольников
//производный от класса TwoDShape
class Triangle extends TwoDShape {
    String style;
    static int id = 0;

    double area() {
        return width * height / 2;
    }

    Triangle(double w, double h, String s) {
        this.width = w;
        this.height = h;
        this.style = s;
    }

    void ShowTrinagle() {
        id++;
        System.out.println("Информация о t" + id);
        System.out.println("Треугольник - " + style);
        ShowDim();

        double v = width * height / 2;
        System.out.println("Площадь - " + v);

    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0, 4.0, "закрашенный");
        Triangle t2 = new Triangle(8.0, 12.0, "контурный");
        t1.ShowTrinagle();
        System.out.println();
        t2.ShowTrinagle();

    }
}

/*
Супер-класс TwoDShape имеет доступ лишь к некоторым членам класса - width,height,showDim();
Наследник же имеет доступ к style,area(),ShowTrinagle() и к членам супер-класса.
 */
class Rectangle extends TwoDShape {
    boolean isSquare() {
        if (width == height) {
            System.out.println("Прямоугольник является квадратом");
            return true;
        } else System.out.println("Треугольник не является квадратом");
        return false;
    }

    double area() { // вычисляет площадь прямоугольника
        return width * height;
    }
}