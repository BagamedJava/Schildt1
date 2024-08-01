package HomeWork;

public class Ch5_t13 {
    public static void main(String[] args) {
        int[] nums2 = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums2[0];

        for (int i : nums2) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("min и max: " + min + " " + max);


    }

}

