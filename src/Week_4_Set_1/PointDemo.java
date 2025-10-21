package Week_4_Set_1;

class Point {
    private int x,y;
    public Point(int x,int y){ this.x=x; this.y=y; }
    // copy constructor
    public Point(Point other){ this(other.x, other.y); }
    @Override public String toString(){ return "(" + x + "," + y + ")"; }
}

public class PointDemo {
    public static void main(String[] args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(p1);
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
    }
}
