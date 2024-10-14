package Chapter9;

public class Rethrow {
    //Повторное генерирование исключений
    static int id = 0;

    public static void genException() {
        int[] numer = {4, 8, 16, 32, 64, 128,256,512};
        int[] denom = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println("Попытка генерации исключения № " + id++);
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Перехват исключения." );

            } catch (ArrayIndexOutOfBoundsException exc) {
                // Перехват исключения
                System.out.println("Нужный элемент не найден");
                throw exc; // Повторная генерация исключения
            }
        }

    }


}
class RethrowDemo{
    public static void main(String[] args) {
        try{
            Rethrow.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            //Повторка
            System.out.println("Фатальная ошибка. Выполнение программы прервано");
        }
    }
}
