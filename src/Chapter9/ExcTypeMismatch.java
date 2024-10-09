package Chapter9;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

    try{
        System.out.println("До генерации исключения");
        // Генерируем исключение в связи
        // с выходом за пределы массива
        nums[7] = 10;
        System.out.println("Не будет выведено на экран");
    } catch (ArithmeticException exc){
        // Пытаемся перехватить исключение ArithmeticException


         /* исключение, связанное с обращением за пределы массива, нельзя обработать
        с помощью инструкции catch, в которой указан тип исключения ArithmeticException */

        System.out.println("Выход за пределы массива!");

    }catch (ArrayIndexOutOfBoundsException exc){
        System.out.println("Всем постам - пизда! У нас авария. Мы ее перехватываем. ");
    }
        System.out.println("После инструкции catch");








    }
}
