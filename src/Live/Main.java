package Live;

//class Student {
//    String name; // Attribute
//    int age; // Attributes
//    static boolean wearsUniform = true;
//    void print(){
//        int a = 8;
//        System.out.println(name+" "+age+" "+wearsUniform);
//    }
//    Student(String name, int age){
//        this.name= name;
//        this.age = age;
//    }
//}

class Account {
    private String name;
    private int balance;
    private String pin;

    int getBalance(){
        return balance;
    }

    String getName(){
        return name;
    }

    void setName(String newName){
        this.name = newName;
    }

    int deposit(int amt){
        balance += amt;
        return balance;
    }

    Account(String name){
        this.name = name;
        this.balance = 0;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
