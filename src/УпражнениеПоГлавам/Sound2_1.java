package УпражнениеПоГлавам;

public class Sound2_1 {
    public static void main(String[] args) {
        double dist;
        dist = 330 * 7.2;
        System.out.println("Расстояние до места вспышки молнии " + "составляет " + dist + " метров");
double echo = 2.0;
dist = dist / echo;
        System.out.println(dist);
    }
}
