package Chapter8.interfac3;

public class ByThrees implements Series {
    int start, val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThreesDemo {

    public static void main(String[] args) {
        ByThrees ob1 = new ByThrees();

        for (int i = 0; i < 5; i++) {
            System.out.println("След. значение: " + ob1.getNext());
        }
        System.out.println("Сброс");
        ob1.reset();

        ob1.setStart(33);
        for (int i = 0; i < 33; i++) {
            System.out.println("След. значение: " + ob1.getNext());

        }
    }

}
