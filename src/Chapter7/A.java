package Chapter7;
// Использование ключевого слова super
// для предотвращения сокрытия имен

public class A {
    int i;
}
// создание подкласса, расширяющего класс А
class B extends A{
    int i; // эта переменная скрывает переменную из класса А
    B(int a, int b){
        super.i = a; // Переменная i из класса А
        i = b; // переменная i из класса B

    }
    void show(){
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
class UseSuper{
    public static void main(String[] args) {
        B subOb = new B(1,2);
        subOb.show();
    }
}