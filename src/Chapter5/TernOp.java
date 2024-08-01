package Chapter5;

public class TernOp {
    public static void main(String[] args) {
        String sr1 = "Yarik";
        String sr2 = "YariK";
        System.out.println(sr1.equals(sr2) ? "Ярик=Ярик" : "ЯриK != Ярик");


        int OwnWeight = 100;
        int KWeight = 70;
        System.out.println(KWeight == OwnWeight ? "Да, вес одинонаковый" : "Нет, вес разный");

    }
}
