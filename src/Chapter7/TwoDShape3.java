package Chapter7;

public class TwoDShape3 {
    // Этот класс описывается двумерные объекты

    private double width; // эти переменные закрыты
    private double height; // от всяких пидоров

    // методы доступа к переменным экземпляра width и height
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

class Triangle3 extends TwoDShape3 {
    /*
    подкласс для представления треугольников, производный от класса TwoDShape3
     */
    private String style;
    static int id = 0;

    // конструктор
    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);
        this.style = s;

    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }

    void showTriangle3() {
        id++;
        System.out.println("Информация о t" + id);
        showDim();
        showStyle();
        System.out.println("Площадь - " + area());
        System.out.println();
    }
}

class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("закрашенный", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("контурный", 8.0, 12.0);

t1.showTriangle3();
t2.showTriangle3();
    }
}
