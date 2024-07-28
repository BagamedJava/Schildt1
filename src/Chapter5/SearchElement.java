package Chapter5;

public class SearchElement {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int i : nums) {
            System.out.println(i);

            if (i == val) {
                found = true;
                System.out.println("Значение найдено!");
                break;
            }

        }


    }
}
