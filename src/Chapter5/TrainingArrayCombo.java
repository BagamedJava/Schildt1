package Chapter5;

public class TrainingArrayCombo {
    public static void main(String[] args) {
        int[] classic = new int[100];
        int min, max, mid;
        for (int i = -50; i <= 100; i++) {
            classic[i] = i;
        }
        min = max = mid = classic[0];
        for (int m = 1; m < classic.length; m++) {
            if (classic[m] < min) min = classic[m];
            if (classic[m] > max) max = classic[m];
            if (classic[m] == 49) mid = classic[m];
        }
        System.out.println(min + " " + max + " " + mid);
    }
}
