package Demo;
class Main {
    int age = 8;

    public boolean equals(Main obj) {
        System.out.println("here");
        return (this.age == obj.age);
    }

    @Override
    public String toString() {
        return "Main"+age;
    }

    public static void main(String[] args) {
//        Main m = new Main();
//        Main m1 = m;
//        System.out.println(m);
        Integer n1 = new Integer(6); // boxing
        int n2 = n1.intValue(); // unboxing

        Integer n3 = 7; // auto-boxing
        int n4 = n3; // auto-unboxing

        String name = "goms";

        System.out.println(n1+n2);
    }
}
