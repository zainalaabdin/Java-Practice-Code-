class NewClassTest {
    static int i = 10;

    public static void test() {
        System.out.println("TEST METHOD");
    }
}

public class Test {
    public static void main(String[] args) {
        NewClassTest.test();
        System.out.println(NewClassTest.i);
    }
}
