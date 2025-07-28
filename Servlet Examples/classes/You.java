class NewClassTest {
    static int i = 10;
    static int j = 10;

    public static void test() {
        System.out.println("TEST METHOD");
    }
}

public class You {
    public static void main(String[] args) {
        NewClassTest.test();
        System.out.println(NewClassTest.i + NewClassTest.j);
    }
}
