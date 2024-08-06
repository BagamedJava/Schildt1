package Chapter6;

public class Summation {
    int sum;

    // Создание объекта на основе целочисленного значения:
    Summation(int num){
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }
    // Создание одного объекта на основе другого:
    Summation(Summation ob){
        sum = ob.sum;
    }
}
class SumDemo{
    public static void main(String[] args) {

        Summation s1 = new Summation(5);
        Summation s2 = new Summation(10);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
