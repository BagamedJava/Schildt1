package Chapter6;

public class StaticMeth {
    static int val = 1024;

    static int ValDiv() {
        return val / 2;
    }
}

class StaticMethDemo {
    public static void main(String[] args) {

        StaticMeth sm1 = new StaticMeth();
        System.out.println("Значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.ValDiv: " + StaticMeth.ValDiv());
        System.out.println();
        StaticMeth.val = 4;
        System.out.println("Теперь значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.ValDiv: " + StaticMeth.ValDiv());
        sm1.val = 6;
        System.out.println("Теперь значение val через sm1.val: " + sm1.val);
        System.out.println("Теперь значение val через StaticMeth.val: " + StaticMeth.val);

        System.out.println("ValDiv через sm1.ValDiv(): " + sm1.ValDiv());
        System.out.println("ValDiv через StaticMeth.ValDiv(): " + StaticMeth.ValDiv());


    }
}