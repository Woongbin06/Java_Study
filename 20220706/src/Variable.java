public class Variable {
    public static void main(String[] args) {
        int x; // 변수 선언
        x = 1;
        System.out.println(x + 1); // 2 출력
        x = 2;
        System.out.println(x + 1); // 3 출력
        double y; // 실수형 변수 선언
        y = 1.1;
        System.out.println(y + 1.1); // 2,2 출력
        String z = "coding ", a = "everbody"; // 문자열 변수선언과 초기화
        System.out.println(z + a);

        double b = 3.0f; // float형의 값이 double형으로 자동형변환
        int c = (int)100.0f; // 명시적 형 변환
    }
}
