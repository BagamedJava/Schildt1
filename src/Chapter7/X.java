package Chapter7;

public class X {
    // обращение к объекту подкласса по ссылочной переменной суперкласса

    int a;
    X(int i){ a = i;}
}
class Y extends X{
    int b;
    Y(int i,int j){
        super(j);
        b = i;
    }
}
class SupSubRef{
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5,6);

        x2 = x; // Обе переменные одного типа, допустимо.
        System.out.println("x2.a: " + x2.a);//10
        x2 = y; // по прежнему допустимо, обе переменные одного типа
        System.out.println("x2.a: " + x2.a);//6
        // в классе Х известны только члены класса Х
        x2.a = 19;// допустимо
        // x2.b = 27; Ошибка, т.к. переменная b не является членом класса Х
    }
}
