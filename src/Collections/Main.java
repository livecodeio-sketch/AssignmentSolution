package Collections;

import java.util.*;

class Student {
    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        int mark = 56;
        // int [] marks = new int[30];
        // marks[5] = 78;

        // Abstract Data types
//        List<Integer> marks = new LinkedList<>();
////        ArrayList<Integer> marks = new ArrayList<Integer>();  // Dynamic Array
//        marks.add(56);
//        marks.add(67);
//        marks.add(78);
//        marks.add(7);
//        marks.add(56);
//        marks.addFirst(0);
//        marks.addLast(100);
//        marks.add(2,100);
//        marks.remove(2);
//
//        marks.sort(Comparator.naturalOrder());
//        marks.sort(Comparator.reverseOrder());

        Student s1 = new Student("Goms", 12);
        Student s2 = new Student("Code", 23);
        Student s3 = new Student("io", 3);

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        students.sort(Comparator.comparingInt(s->s.marks));

//        for(Student s: students){
//            System.out.println(s.name+" "+s.marks);
//        }

        Set<Integer> rating = new HashSet<>();
        rating.add(3);
        rating.add(3);
        rating.add(3);
        rating.add(5);
        rating.add(7);
        rating.add(67);
        rating.add(456);
        rating.add(9);
        rating.add(15);

        Iterator<Integer> itr = rating.iterator();
        
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //System.out.println(rating);

        Map<String, Integer> marks = new TreeMap<>();
        marks.put("Vimal", 97);
        marks.put("Goms", 25);
        marks.put("Sam", 87);
        marks.put("Goms", 97);
        
        Iterator<String> itr1 = marks.keySet().iterator();

        while (itr1.hasNext()){
            String s = itr1.next();
            System.out.println(s+" "+marks.get(s));
        }

        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(56);
        st.push(34);
        st.pop();

        //System.out.println(st.empty());
        // goms - smog
        Queue<Integer> q = new ArrayDeque<>();
        q.add(4);
        q.add(4);
        q.add(5);
        q.remove();



        //System.out.println(q.peek());

        //System.out.println(marks);

    }
}
