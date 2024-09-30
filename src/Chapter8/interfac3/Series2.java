package Chapter8.interfac3;

public interface Series2 {
    int getNext(); // возврат след числа в ряду

    // возврат массива, который содержит n элементов,
    // располагающихся в ряду вслед за текущим элементом

    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset(); //  сброс

    void setStart(int x); // установка начального значения
}

class ShowTits implements Series2 {
    int start, val;

    ShowTits() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val +=1;
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

    @Override
    public int[] getNextArray(int n) {
        return Series2.super.getNextArray(n);
    }
}

class ShowTitsDemo {
    public static void main(String[] args) {
        ShowTits st1 = new ShowTits();
st1.getNextArray(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("След. значение: " + st1.getNext());

        }
    }
}