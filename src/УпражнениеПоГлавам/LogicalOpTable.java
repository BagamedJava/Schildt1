package УпражнениеПоГлавам;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        int x;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = false;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

int y,z;
y = 0;
z = 10;
if (z != 10 && (z/y) == 0){
    System.out.println(z/y);
}
int c;
for (c=0;c<=100;c++){
    if (c % 2 == 0){
        System.out.println(c);
    }
}
    }
}
