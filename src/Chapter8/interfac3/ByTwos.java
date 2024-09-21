package Chapter8.interfac3;

class ByTwos implements Series {
    int start, val;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
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

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("След. значение: " + ob.getNext());
        }

        System.out.println("\nСброс");
        ob.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("След. значение: " + ob.getNext());
        }

        System.out.println("\nСброс");
        ob.reset();


        System.out.println("\nНачальное значение: 100 ");
        ob.setStart(100);


        for (int i = 0; i < 5; i++) {
            System.out.println("След. значение: " + ob.getNext());
        }

    }

}
