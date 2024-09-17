package Chapter8.bookpack;

public class Book3 {
    // При объявлении этих переменных
    // использован модификатор доступа protected

    protected String title;
    protected String author;
    protected int pubDate;
private static int id = 1;

    public Book3(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.print("№" + id + " книга - " );
        id++;
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}
