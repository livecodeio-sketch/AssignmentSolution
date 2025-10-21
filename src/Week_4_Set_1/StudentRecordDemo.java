package Week_4_Set_1;

class StudentRecord {
    private String name;
    private int rollNo;
    private int[] marks;
    public StudentRecord(String name, int rollNo, int[] marks){
        this.name = name; this.rollNo = rollNo; this.marks = marks.clone();
    }
    // copy constructor
    public StudentRecord(StudentRecord other){
        this(other.name, other.rollNo, other.marks);
    }
    public void setMark(int idx, int val){ marks[idx] = val; }
    public void print(){
        System.out.printf("Name: %s, Roll: %d, Marks: ", name, rollNo);
        for(int m : marks) System.out.print(m + " ");
        System.out.println();
    }
}

public class StudentRecordDemo {
    public static void main(String[] args){
        StudentRecord s1 = new StudentRecord("Eve", 101, new int[]{90, 92, 85});
        StudentRecord s2 = new StudentRecord(s1); // copy
        s2.setMark(0, 50); // should not affect s1
        s1.print();
        s2.print();
    }
}
