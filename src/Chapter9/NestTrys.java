package Chapter9;

public class NestTrys {
    //Вложенные блоки try
    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};


        try {// Внешний блок
            for (int i = 0; i < numer.length; i++) {
                try { // внутренний блок try
                    System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);

                } catch (ArithmeticException exc){
                    // Перехват исключения
                    System.out.println("Попытка деления на нуль");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            // перехват исключения
            System.out.println("Выход за пределы массивы");
            System.out.println("Фатальная ошибка. ");
        }
    }
}