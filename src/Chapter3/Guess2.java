package Chapter3;

import java.io.IOException;

public class Guess2 {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапозана A - Z");
        System.out.println("Попытайся ее угадать");
    ch = (char) System.in.read();
    if (ch == answer){
        System.out.println("Правильно!");
    } else {
        System.out.println("Неверно. Нужна буква находится ");
    if (ch<answer) System.out.println("Ближе к концу алфавита");

    else System.out.println("Ближе к началу алфавита");
    }












    }
}





















