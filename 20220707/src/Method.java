public class Method {
    public  static  void numbering(int limit) { // 메소드 정의
        int i;
        /*while (i < limit) {
            System.out.println(i);
            i++;
        }*/
        for(i = 0; i < limit; i++)
            System.out.println(i); // 0 ~ limit까지 출력
    }

    public static void main(String[] args) {
        numbering(10); // 메소드 호출
        numbering(5);
    }
}