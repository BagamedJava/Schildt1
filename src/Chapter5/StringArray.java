package Chapter5;

public class StringArray {
    public static void main(String[] args) {
        String[] StrArray = {"Эта", "строка", "является", "тестом."};
        System.out.println("Исходный массив: ");
        for (String i : StrArray) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

// Изменение строки
        StrArray[2] = "также является";
        StrArray[3] = "тестом!";

        System.out.println("Измененный массив: ");
        for (String i : StrArray)
            System.out.print(i + " ");
    }
}
