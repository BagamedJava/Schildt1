package Chapter3;

public class ForShort {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; ){ // отсутствует итерационное выражение
            System.out.println("Проход № " + i);
            i++; // инкрементирование цикла for
        }
    }
}
