package Chapter8_1;

import Chapter8.bookpack.Book;
import Chapter8.bookpack.Book2;

public class Book2Demo {
    public static void main(String[] args) {
        Chapter8.bookpack.Book2[] books = new Chapter8.bookpack.Book2[5];
        books[0] = new Chapter8.bookpack.Book2("Java: руководство для начинающих, 7-е издание"
                , "Герберт Шилдт", 2018);
        books[1] = new Chapter8.bookpack.Book2("Java: полное руководство, 10 издание"
                , "Герберт Шилдт", 2018);
        books[2] = new Chapter8.bookpack.Book2("Искусство программирования на Java"
                , "Герберт Шилдт", 2005);
        books[3] = new Chapter8.bookpack.Book2("Красным шторм поднимается",
                "Том Клэнси", 2006);
        books[4] = new Chapter8.bookpack.Book2("В дороге", "Джек Керуак", 2012);

        for (int i = 0; i <books.length; i++) {
            books[i].show();

        }

    }
}
