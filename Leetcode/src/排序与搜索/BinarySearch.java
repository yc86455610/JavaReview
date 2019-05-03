import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        solution_bsearch bsearch = new solution_bsearch();
        int[] a = {2, 3, 5, 6, 8};
        int[] b = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        int m = 10;
        int n = 5;
        int value = 5;
        int value1 = 8;
        int value2 = 6;
        int value3 = 7;
        int[] c = {3, 4, 6, 7, 10};
        int[] d = {3, 5, 6, 8, 9, 10};
//        System.out.println(bsearch.bsearch(a, n, value));
//        System.out.println(bsearch.bsearch1(b, m, value1));
//        System.out.println(bsearch.bsearch2(b, m, value1));
//        System.out.println(bsearch.bsearch3(c, n, value2));
        System.out.println(bsearch.bsearch4(d, n, value3));
    }
}

class solution_bsearch {
    public int bsearch(int[] a, int n, int value) {
        //最简单的二分查找：有序数组中不存在重复元素
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value)
                return mid;
            else if (a[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public int bsearch1(int[] a, int n, int value) {
        //查找第一个值等于给定值的元素
        //二分查找的变体形式
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                //mid==0 数组第一个元素肯定是要找的
                //a[mid-1] != value， 前一个元素不等于value，也说明a[mid]是要找的第一个元素
                if ((mid == 0) || (a[mid - 1] != value)) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public int bsearch2(int[] a, int n, int value) {
        //查找最后一个值等于给定值的元素
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] != value)) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch3(int[] a, int n, int value) {
        //查找第一个大于等于给定值的元素
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid + 1]) != value) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int bsearch4(int[] a, int n, int value) {
        //查找最后一个小于等于给定值的元素
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if ((mid == n - 1) || (a[mid + 1] != value)) return mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}