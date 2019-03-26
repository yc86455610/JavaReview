/**
 * 要求不能使用乘除法、for、while、if、else、switch、case 等关键字及条件判断语句 A ? B : C。
 * <p>
 * 短路与 &&
 */


class Test64 {
    public static void main(String[] args) {
        Solution64 solution64 = new Solution64();
        System.out.println(solution64.Sum_Solution(100));

    }
}

class Solution64 {
    public int Sum_Solution(int n) {
        int sum = n;
        //短路与，第一项是false不再执行第二项
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}