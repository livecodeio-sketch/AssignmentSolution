package Live;

class Dummy{
    static int dumDum;
}

public class StaticDemo {
    public static void main(String[] args) {
        Dummy d1 = new Dummy();
        d1.dumDum = 20;

        Dummy d2 = new Dummy();
        d2.dumDum = 30;

        System.out.println(d1.dumDum);
        System.out.println(Dummy.dumDum);
    }
}
