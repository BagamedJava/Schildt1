package Chapter9;

public class EcxDemo5 {
    // В инструкциях catch исключения подкласса должны
    // предшествовать исключениям суперкласса
    static int id = 0;

    public static void main(String[] args) {
        // Длинна массива numer превышает длину массива denom
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                id++;
                System.out.print("Попытка №" + id + " \n");
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
            } catch (Throwable exc) {
                System.out.println("Возникло исключение!");
            }
        }
    }
}
