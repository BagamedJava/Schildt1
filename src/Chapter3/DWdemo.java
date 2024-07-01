package Chapter3;

import java.io.IOException;

public class DWdemo {
    /* do {
    инструкция
    } while(Условие);
     */
    public static void main(String[] args) throws IOException {
        char ch;
        int i;
        int sum = 0;

        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read();

        } while (ch != 'q');

    }
}
