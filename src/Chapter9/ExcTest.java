package Chapter9;
/*
исключение может быть сгенерировано одним методов,
 а перехвачено другим
 */
public class ExcTest {
    static void genException(){
        int [] nums = new int [4];
        System.out.println("До генерации исключения");

        // Выход за пределы массива
        nums[7] = 10; // исключение сгенерировано
        System.out.println("Эта строка не будет отображаться");
    }
}
class ExcDemo2{
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за пределы массива");
        }
        System.out.println("После инструкции catch");
    }
}
