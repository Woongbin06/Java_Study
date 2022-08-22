public class PrimaryAndReferenceType {
    public static void main(String[] args) {
        // 기본 자료형의 대입연산
        int value1 = 3;
        int value2 = value1;
        value2 = 7;
        System.out.println(value1 + "\n" + value2);

        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1;
        array2[0] = 7;

        System.out.println(array1[0]);
        System.out.println(array2[0]);

        System.out.println(array1 + "\n" + array2);
    }
}
