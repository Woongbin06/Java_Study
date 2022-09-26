package Chapter7;

import java.util.Arrays;

public class ArrayArgumentMethod {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        printArray(a);
        printArray(new int[]{1, 2, 3});
//        printArray({1, 2, 3}); 오류 발생
    }

    public static void printArray(int[] a) {
        // int[] a;
        // a = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(a));
    }
}
