package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Nick");
        info info1 = new Animal(2);
        info info2 = new Person("Alber");
        animal1.showInfo();
        person1.showInfo();
        System.out.println();
        info1.showInfo();
        info2.showInfo();
    }

}
