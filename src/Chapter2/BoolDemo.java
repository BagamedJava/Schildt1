package Chapter2;

public class BoolDemo {
    public static void main(String[] args) {

        boolean b;
        b = false;
        System.out.println("Значение b - " + b);
        b = true;
        System.out.println("Теперь значение b - " + b);
        if (b){
            System.out.println("Выполняется");
        }
        b = false;
        if (b){
            System.out.println("Не выполняется");
        }
        System.out.println("Результат сравнения 10>9 - " + (10>9));


    }




}
