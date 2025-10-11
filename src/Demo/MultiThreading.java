package Demo;

class C{
    static int counter = 0;
    static synchronized void count(String name){
        counter ++;
        System.out.println(name+counter);
    }
}

class A implements Runnable{
    public void run(){
        for(int i=0; i<1000; i++){
            //System.out.println("hi");
            C.count("A");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<1000; i++){
           // System.out.println("code io");
            C.count("B");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(C.counter);

        // main thread

    }
}
