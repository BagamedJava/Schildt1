package HomeWork;

public class Chapter6_ex13 {

    int b = 0;

    int sum(int... a) {

        System.out.println("Кол-во аргументов: " + a.length);
        System.out.println("Содержимое: ");

        for (int value : a) {
            System.out.println(value);
            b += value;
        }
        System.out.print("Общее значение: ");
        return b;
    }



}

class Ch6_ex13Test {

    public static void main(String[] args) {
        Chapter6_ex13 sum1 = new Chapter6_ex13();


        System.out.println(sum1.sum(1, 2, 3, 4, 5));

    }
}