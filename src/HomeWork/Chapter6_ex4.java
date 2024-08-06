package HomeWork;


public class Chapter6_ex4 {
    int a;

    Chapter6_ex4(int i) {
        a = i;
    }

    static void swap() {
        Chapter6_ex4 ch1 = new Chapter6_ex4(10);
        Chapter6_ex4 ch2 = new Chapter6_ex4(5);

        if (ch1.a > ch2.a) {
            int changer = ch1.a;
            ch1.a = ch2.a;
            ch2.a = changer;

        }
        System.out.println(ch1.a);
        System.out.println(ch2.a);
    }
}
class Ch6_ex4Test{
    public static void main(String[] args) {
        Chapter6_ex4.swap();
    }
}
