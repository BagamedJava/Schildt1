package interfaces;

public class Animal implements info{
    public int id;

    public void showInfo() {
        System.out.println("id is " + this.id);
    }

    public Animal(int id){
        this.id = id;
    }
}
