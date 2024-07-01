package Chapter3;

import java.io.IOException;

public class ForCharTest {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Для остановки программы нажмите S");
        for (i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Проход: " + i);
        }
    }
}
