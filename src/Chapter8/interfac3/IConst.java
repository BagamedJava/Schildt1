package Chapter8.interfac3;

interface IConst {
    int MIN = 0;
    int MAX = 10;

    String ErrosMSG = "Ошибка диапазона";
// В этом интерфейсе только константы.
}

class IConstD implements IConst {
    public static void main(String[] args) {
        int[] nums = new int[MAX];
        for (int i = MIN; i < nums.length+1; i++) {
            if (i >= MAX) System.out.println(ErrosMSG);

            else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}