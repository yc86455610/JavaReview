package 数学;


public class SumOfNumbers {
    //求1-100能被3整除的树之和
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}

