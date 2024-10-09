package Chapter9;

public class ExcDemo3 {
    // Корректная обработка исключения и продолжение выполнения программы
    static int id = 1;
    public static void main(String[] args) {
        int [] numer = {4,8,16,32,64,128};
        int [] denom = {2,0,4,4,0,8};

        for (int i = 0; i<numer.length; i++){
            try {
                System.out.println("Попытка генерации исключения № " + id++ );

                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i] );
            }catch (ArithmeticException exc){
                // Перехват исключения
                System.out.println("Попытка деления на нуль!");
            }
        }
    }
}
