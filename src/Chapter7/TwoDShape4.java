package Chapter7;

public class TwoDShape4 {
    // Добавление конструктора в класс TwoDShape

    private double width;
    private double height;

    // Параметризированный конструктор:
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // методы доступа к переменный экземпляра width и height
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
class Triangle4 extends TwoDShape4{
    private String style;
    Triangle4(String s, double w, double h){
        super(w,h); // вызов конструктора суперкласса
        style = s;
    }
// страница 275
}