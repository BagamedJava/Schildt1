package Chapter6;

public class MyClass {
    private int alpha; // Закрытый доступ
    public  int beta; // открытый доступ

    int gamma; // default, по сути - паблик

    /*
    етоды дсступа к переменной alpha. Члены класса могут обращаться
    к закрытым членам того же класса
     */
    void  setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}
class AccesDemo{
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        /*
        Доступ к переменной alpha возможен только с помощью
        спец. предназначенных для этой цели методов
         */
        ob.setAlpha(-99);

        System.out.println("ob.alpha: " + ob.getAlpha());

        /*
        Обращение к переменной alpha так, как показано ниже - недопустимо
        ob.alpha = 10; АЛЬФА ЗАКРЫТАЯ ПЕРЕМЕННАЯ!!!!!
         */

        /*
        следующие обращения вполне допустимы, так как переменные beta и gamma являются открытыми
         */

        ob.beta = 88;
        ob.gamma = 77;
        System.out.println(ob.beta + " " + ob.gamma);

    }
}