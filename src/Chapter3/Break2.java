package Chapter3;

public class Break2 {
    public static void main(String[] args) {
        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; j < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done;
                }
                System.out.println("После цикла по к");
            }
            System.out.println("После цикла по j");
        }
        System.out.println("После цикла по i");
    }
}