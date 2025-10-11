package Demo;

class Car{
    private static int age =7;
    class Engine{
        void show(){
            System.out.println("Engine Starts"+age);
        }
    }
}

public class StringDemo {
//    public static void main(String[] args) {
////        String s = "code io";
////        String s1 = "code io";
////
////        System.out.println(System.identityHashCode(s));
////        System.out.println(System.identityHashCode(s1));
////
////        s += " io";
////
////        System.out.println(System.identityHashCode(s));
////        System.out.println(System.identityHashCode(s1));
//        StringBuilder sb = new StringBuilder("code");
//        System.out.println(System.identityHashCode(sb));
//        sb.append(" io");
//        System.out.println(sb.indexOf("o"));
//        System.out.println(sb);
//        System.out.println(System.identityHashCode(sb));
//
//    }
    public static void main(String[] args) {
        Car swift = new Car();
        Car.Engine k12 = swift.new Engine();
        k12.show();

    }
}
