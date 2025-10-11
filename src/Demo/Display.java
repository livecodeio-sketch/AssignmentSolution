package Demo;

class Printer {
    public void display(){
        System.out.println();
    }
    public void display(int n){
        System.out.println(n);
    }
    public void display(double d){
        System.out.println(d);
    }
    public void display(String s){
        System.out.println(s);
    }
}

class MySystem {
    public final static Printer outing = new Printer();
}

public class Display {
    public static void main(String[] args) {
        System.out.println();

        MySystem.outing.display(6);
        MySystem.outing.display("Hello");
        MySystem.outing.display(5.6);
        MySystem.outing.display();

    }
}
