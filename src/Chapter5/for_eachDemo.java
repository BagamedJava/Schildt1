package Chapter5;

public class for_eachDemo {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10}; // == 45
        int sum = 0;


for (int x : nums){ // цикл типа for-each
    System.out.println("Значение: " + x);
    sum +=x;
}
        System.out.println("Сумма: " + sum);
    }
}
