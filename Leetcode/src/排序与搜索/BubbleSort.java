
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    //冒泡排序，提前退出冒泡排序的标志位
    public static void main(String[] args) {
        int ARRAYLENGTH = 6;
        int[] array = new int[ARRAYLENGTH];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ARRAYLENGTH; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < ARRAYLENGTH; i++) {
            boolean flag = false;
            for (int j = 0; j < ARRAYLENGTH - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        System.out.println(Arrays.toString(array));
    }

}


