package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " +a); // 1

        a = a + 1; // 1 인 a의 값을 1 증가시킨다.
        System.out.println("a = " +a); // 2

        // 증감 연산자
        ++a; // a = a + 1
        System.out.println("a = " +a); // 3
        ++a;
        System.out.println("a = " +a); // 4
    }
}
