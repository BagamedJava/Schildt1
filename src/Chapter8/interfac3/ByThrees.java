package Chapter8.interfac3;

public class ByThrees implements Series{
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }
    public int getNext(){
        val += 3;
        return val;
    }
    public void reset(){
        start = 0;
        val = 0;
    }

    public void setStart(int x){
        start = x;
        val = x;
    }
}

class ByThreesDemo{
    public static void main(String[] args) {
        ByThrees qwe = new ByThrees();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + ByThrees.getNext());
        }
    }
}