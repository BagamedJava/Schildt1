package Chapter8.bookpack;

public class Book2 {
    // Класс Book и его члены должны быть объявлены открытыми, чтобы их
    // можно было использовать в других пакетах

    private String title;
    private String author;
    private int pubDate;

    // теперь конструктор стал открытым
    public Book2(String t,String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
