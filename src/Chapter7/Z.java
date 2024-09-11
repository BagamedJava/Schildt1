package Chapter7;

public class Z {
    // Переопределение метода
    int i, j;
    Z(int a,int b){
        i = a;
        j = b;
    }
    // Отображение переменных i и j
    void show(){
        System.out.println("i и j: " + i + " и " + j); // Не будет отображено, т.к. метод в V скрывает этот метод
    }
}
class V extends Z{
    int k;
    V(int a,int b, int c){
        super(a,b);
        k = c;
    }
    // Отображение переменной k - переопределение метода show() в A
    void show(){ // метод show() в V переопределяет метод show() в Z
//        super.show(); вызов метода из суперкласса.

        System.out.println("k: " + k);
    }

}
class Override{
    public static void main(String[] args) {
        V SubOb = new V(1,2,3);
        SubOb.show(); // Вызов метода show() из класса V
    }
}
