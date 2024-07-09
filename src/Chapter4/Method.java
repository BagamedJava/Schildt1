package Chapter4;

public class Method {
    void Method1() {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) return;
            System.out.println(i);
        }
    }
void  Method2() {

    }
}
class MethodTest{
    public static void main(String[] args) {
        Method meth = new Method();
        meth.Method1();
    }
}