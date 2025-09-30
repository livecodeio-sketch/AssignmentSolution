package Week_3_Set_1;

class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(10, 7);

        System.out.println("Rectangle 1 Area: " + r1.area());
        System.out.println("Rectangle 1 Perimeter: " + r1.perimeter());

        System.out.println("Rectangle 2 Area: " + r2.area());
        System.out.println("Rectangle 2 Perimeter: " + r2.perimeter());
    }
}