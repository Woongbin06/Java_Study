public class Array {
    public static void main(String[] args) {
        // String[] classGroup = { "강웅빈1", "권세원1", "강웅빈2", "권세원2"}; // 배열 선언, 각각의 값들은 문자열
        String[] classGroup = new String[4]; // 배열 정의
        classGroup[0] = "강웅빈1";
        System.out.println(classGroup[0]); // 0번째 값 출력 -> 강웅빈1
        System.out.println(classGroup.length); // 길이는 4
        classGroup[1] = "권세원1";
        System.out.println(classGroup[1]); // 1번째 값 출력 -> 권세원1
        classGroup[2] = "강웅빈2";
        classGroup[3] = "권세원2";

        for(int i = 0; i < classGroup.length; i++) {
            String member = classGroup[i];
            System.out.println(member + "이 복권에 당첨되었다랄까?");
        }
        // for each문
        for(String e : classGroup) { // e에 classGroup의 값을 하나씩 저장
            System.out.println(e + "이 복권에 당첨되었다랄까?!");
        }
    }
}