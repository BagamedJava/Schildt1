package Chapter5;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] samle = new int[10];
        int i;
        for (i = 0; i <= 10; i++)
            samle[i] = i;

        for (i = 0; i <= 10; i++)
            System.out.println("Элемент[" + i + "]: " + samle[i]);
    }
}
