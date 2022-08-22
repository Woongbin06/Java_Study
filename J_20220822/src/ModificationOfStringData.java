public class ModificationOfStringData {
    public static void main(String[] args) {
        // 문자열 생성 (문자열 클래스자료형을 이용함)
        /*String str1 = new String("안녕");
        System.out.println(str1);
        String str2 = str1;

        str1 = "안녕하세요"; // new String("안녕하세요");
        System.out.println(str1);
        System.out.println(str2);*/

        /*String str1 = new String("안녕"); // new하면 무조건 객체 생성
        String str2 = "안녕"; // 최초1회는 그냥 객체생성
        String str3 = "안녕"; // 2회부터는 있는 놈 재활용
        String str4 = new String("안녕"); // new하면 무조건 객체 생성

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str4 == str3);
        System.out.println(str1 == str4);*/

        // 문자열 + 문자열
        /*String str1 = "안녕" + "하세요" + "!";
        System.out.println(str1);

        // 문자열과 기본 자료형 혼용
        System.out.println(1 + "안녕");
        System.out.println(1 + "안녕" + 2);
        System.out.println("안녕" + 1 + 2);
        System.out.println(1 + 2 + "안녕");*/

        // 문자열 검색 charAt()
        /*String str1 = "Hello Java";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));
        System.out.println();*/

        // indexOf(), lastIndex()
        /*System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));

        // valueOF() : 기본 자료형의 값을 문자열로 변환시켜줌.
        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);*/

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);

        System.out.println(str2.equals(str3));
        System.out.println(str4.equals(str3)); // 대소문자 구분함.
        System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자 구분 안함.
    }
}