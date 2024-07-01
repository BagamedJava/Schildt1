package Chapter2;

public class LogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("i == j");
        if (i >= j) System.out.println("i >= j");
        if (i > j) System.out.println("i > j");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("Это не будет выполнено");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) : true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");

    }
}
