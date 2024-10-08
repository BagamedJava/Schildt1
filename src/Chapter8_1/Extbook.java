package Chapter8_1;

import УпражнениеПоГлавам.Sound2_1;

import java.net.IDN;

public class Extbook extends Chapter8.bookpack.Book3 {
    private String publisher;
    public Extbook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    /*
    След инструкции допустимы, посколько подклассы имеют право доступа
    к членам класса, объявленным защищенными
    Доступ к членам класса Book3 разрешен для подклассов
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }
    public void setPubDate(int d){pubDate = d;}
}
class ProtectDemo{
    public static void main(String[] args) {
        Extbook [] books = new Extbook[5];

        books[0] = new Extbook("Java: руководство для начинающих, 7-е издание",
                "Герберт Шилдт", 2018, "Вильямс");
        books[1] = new Extbook("Java: полное руководство, 10-е издание",
                "Герберт Шилдт", 2018, "Вильямс");
        books[2] = new Extbook("Искусство программирования на Java",
                "Герберт Шилдт", 2003, "Диалектика");
        books[3] = new Extbook("Красным шторм поднимается","Том Клэнси",
                2006, "Эксмо");
        books[4] = new Extbook("В дороге", "Джек Керуак",2012,"Азбука");

        for (int i = 0; i < books.length ; i++) {
            books[i].show();
        }
        // Поиск книг по автору:
        System.out.println("Все книги Герберта Шилдта: " );
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Герберт Шилдт"){
                System.out.println(books[i].getTitle());
            }

        }



    }
}