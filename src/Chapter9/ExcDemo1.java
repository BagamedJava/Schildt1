package Chapter9;

public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try  { // создание блока try
            System.out.println("До генерации исключения");
            nums[8] = 10; // попытка выйти за пределы массива nums
            System.out.println("Эта строка не будет отображаться");
        }
        catch (ArrayIndexOutOfBoundsException exc) {// перехват ошибок, вызываемых выходом за пределы массива
            System.out.println("Выход за пределы массива!");
        }
        System.out.println("После инструкции catch");
    }
}
