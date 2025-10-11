package Live;

public class Overloading {
    int age;
    //int arr[];
    Overloading(){
        age = 20;
    }

    Overloading(int age){
        this.age = age;
//        arr = new int[5];
//        arr[0] = 89;
    }

    // copy constructor
    Overloading(Overloading o){
        this.age = o.age;
        // this.arr = o.arr; // shallow copy
//        this.arr = new int[o.arr.length];
//        for(int i=0;i<arr.length;i++){
//            this.arr[i] = o.arr[i]; // deep copy
//        }
    }

    static int add(int n1, int n2){
        return n1+n2;
    }

    static double add(double n1, double n2){
        return n1+n2;
    }

    static int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public static void main(String[] args) {
//        System.out.println(add(2,4));
//        System.out.println(add(1,3,5));
//        System.out.println(add(2.0, 8.6));
//        Overloading o = new Overloading();
//        System.out.println(o.age);
//        Overloading o1 = new Overloading(25);
//        System.out.println(o1.age);
//        Overloading o2 = new Overloading(23);
//        Overloading o2Copy = new Overloading(o2); // 23
//        o2.age = 78;
//        o2.arr[0] = 98;
//        System.out.println(o2Copy.age);
//        System.out.println(o2Copy.arr[0]);
        Overloading o = new Overloading(2);
        Overloading o1 = o;
    }
}
