package Week_4_Set_1;

class Person {
    protected String name;
    protected int age;
    public Person(String name, int age){ this.name=name; this.age=age; }
}

class Student extends Person {
    protected double[] marks;
    protected char grade;
    public Student(String name, int age, double[] marks){
        super(name, age);
        this.marks = marks.clone();
        calculateGrade();
    }
    protected void calculateGrade(){
        double sum = 0;
        for(double m: marks) sum += m;
        double avg = sum / marks.length;
        if(avg >= 90) grade = 'A';
        else if(avg >= 75) grade = 'B';
        else if(avg >= 60) grade = 'C';
        else grade = 'D';
    }
    public void printInfo(){
        System.out.printf("Student: %s, age: %d, grade: %s%n", name, age, grade);
    }
}

class GraduateStudent extends Student {
    private String researchTopic;
    public GraduateStudent(String name, int age, double[] marks, String topic){
        super(name, age, marks);
        this.researchTopic = topic;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class StudentDemo {
    public static void main(String[] args){
        GraduateStudent gs = new GraduateStudent("Goms", 25, new double[]{85, 92, 88}, "Distributed Systems");
        gs.printInfo();
    }
}
