package Live;
class Human {
    private int bankBalance = 2000;
    protected int age;
    void speak() {

    }
    Human(int age){
        this.age = age;
    }
}
// Human();
public class Student extends Human {
    String name;
    void speak(){
        System.out.println(name+" "+ age);
    }

    Student (String name, int age){
        super(age);
        this.name = name;
    }

    public static void main(String[] args) {
        Student goms = new Student("Goms", 20);
        goms.name = "code io";
//        goms.display();
    }
}
