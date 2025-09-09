public class Test1 {
    private static void m1() {
        System.out.println("private");
    }
    static void m2(){
        System.out.println("default");
    }
    protected static void m3(){
        System.out.println("protected");
    }
    public static void m4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
    }
}
class Subset extends Test1{
    public static void main(String[] args) {
        m2();
        m3();
        m4();
    }
}