public class Boolean {
    public static void main(String[] args) {
        if(true) { // false는 실행안함
            System.out.println("result : ture");
        }
        if(false) {
            System.out.println(1);
        }
        else if(false) {
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }
        switch (1) {
            case 1: System.out.println("one");
            break; // one 출력후 switch문 탈출
            case 2: System.out.println("two");
            break;
            default: System.out.println("three"); // 마지막은 default
        }
    }
}
