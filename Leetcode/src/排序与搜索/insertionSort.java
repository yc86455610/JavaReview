
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Scanner;

public class insertionSort {
    //插入排序
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ARRAYlENGTH = 6;
        int[] array = new int[ARRAYlENGTH];
        for (int i = 0; i < ARRAYlENGTH; i++) {
            array[i] = sc.nextInt();
        }

        //i表示未排序区间的下标
        for (int i = 1; i < ARRAYlENGTH; i++) {
            //j表示已排序区间的下标
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value)
                    array[j + 1] = array[j];
                else
                    break;
            }
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}

