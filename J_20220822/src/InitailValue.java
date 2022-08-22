import java.util.Arrays;

public class InitailValue {
    public static void main(String[] args) {
        // 스택 메모리값(강제 초기화 되지 않음)
        int value1;
        // System.out.println(value1); // 오류
        int[] value2;
        // System.out.println(value2); // 오류

        boolean[] array1 = new boolean[3]; // false로 자동 초기화
        for (boolean value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] array2 = new int[3]; // 0으로 자동 초기화
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[] array3 = new double[3]; // 0.0으로 자동 초기화
        for (double value : array3) {
            System.out.print(value + " ");
        }
        System.out.println();

        String[] array4 = new String[3]; // null로 자동 초기화
        for (String value : array4) {
            System.out.print(value + " ");
        }
        System.out.println();

        // int, boolean, double은 기본 자료형이고(값이 담김)
        // String은 참조형이다. (주소가 담김)

        // 배열은 한 번에 출력하는 방법
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

        // 배열 for문으로 출력하는 가장 멋진방법(enhanced for문, foreach)
        for (boolean k : array1) {
            System.out.println(k);
        }
    }
}
