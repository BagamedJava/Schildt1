package Chapter9;

public class ThrowDemo {
    // Генерирование исключения вручную
    public static void main(String[] args) {
        try{
            System.out.println("До инструкции throw");
            throw new ArithmeticException(); // генерирование исключения
        }
        catch (ArithmeticException exc){
            // Перехват исключения
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try{}catch");
    }
}
