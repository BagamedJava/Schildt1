package Chapter3;

import java.io.IOException;

import static java.lang.System.*;

public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;
        out.println("Нажмите нужную клавишу, а затем ENTER");
        ch = (char) in.read();
        out.println("Вы нажали клавишу " + ch);




    }
}
