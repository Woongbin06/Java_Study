package Chapter7;

class E{
    int m1, m2, m3, m4;

    E() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    E(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    E(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4 + " ");
        System.out.println();
    }
}

class F{
    int m1, m2, m3, m4;

    F() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    F(int a) {
        this();
        m1 = a;
    }

    F(int a, int b) {
        this(a);
        m2 = b;
    }

    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4 + " ");
        System.out.println();
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        E e1 = new E();
        E e2 = new E(10);
        E e3 = new E(10, 20);
        e1.print();
        e2.print();
        e3.print();
        System.out.println();

        F f1 = new F();
        F f2 = new F(10);
        F f3 = new F(10, 20);
        f1.print();
        f2.print();
        f3.print();
        System.out.println();
    }
}
