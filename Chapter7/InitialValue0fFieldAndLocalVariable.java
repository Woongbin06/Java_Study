package Chapter7;

class B {
    boolean m1;
    int m2;
    double m3;
    String m4;

    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable() {
        int k;
//        System.out.println(k); 오류 발생 초기화하지 않아서
    }
}

public class InitialValue0fFieldAndLocalVariable {
    public static void main(String[] args) {
        B b = new B();

        b.printFieldValue();
    }
}
