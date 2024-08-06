package Chapter6;

public class Test {
    /*
    Этот метод не может изменить значения аргументов,
     передаваемых ему при вызовые
     */
//    void noChange(int i, int j) {
//        i = i + j;
//        j = -j;
//        System.out.println(i + " " + j);
//    }


    int a,b;
    Test(int i,int c){
        a = i;
        b = c;
    }
    void Change(Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
        System.out.println("ob.a + ob.b: " + ob.a +
                " ob.b: " + ob.b);
    }

}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(10,20);
        ob.Change(ob);
//        int a = 15, b = 20;
//        System.out.println("а и b перед вызовом: " + a + " " + b);
//        ob.noChange(a, b);
//        System.out.println("а и b после вызова: " + a + " " + b);
//        ob.noChange(1,100);


    }
}