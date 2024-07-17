package Chapter5;

public class MinMax2 {
    public static void main(String[] args) {
        int[] nums2 = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums2[0];

        for (int i = 1; i < nums2.length; i++) {

            if (nums2[i] < min) min = nums2[i];
            if (nums2[i] > max) max = nums2[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
