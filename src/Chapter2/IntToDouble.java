package Chapter2;

public class IntToDouble {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x/y); // привести тип double к типу int
        System.out.println("Целочисленный результат деления x/y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88; // представление символа Х в коде ASCII
        ch = (char) b;
        System.out.println("ch: " + ch);


    }
}
