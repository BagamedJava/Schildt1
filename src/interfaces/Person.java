package interfaces;

public class Person implements info {
    public String name;

    public void showInfo() {
        System.out.println("Hello," + this.name);
    }

    public Person(String name) {
        this.name = name;
    }
}
