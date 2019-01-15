

public class Test {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.countPrimes(10));


    }
}


class Solution {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];   //合数集合
        int count = 0;

        //遍历寻找素数,范围是2到n
        for (int i = 2; i < n; i++) {
            if (notPrimes[i]) {
                continue;
            }

            count++;

            for (int j = i * i; j < n; j += i) {
                notPrimes[j] = true;  //都是合数（非素数）
            }
        }

        return count;

    }
}