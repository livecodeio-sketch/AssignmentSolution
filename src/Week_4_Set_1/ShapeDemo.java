package Week_4_Set_1;

abstract class Shape {
    public abstract double area();
}

// Circle.java
class Circle extends Shape {
    private double r;
    public Circle(double r){ this.r = r; }
    @Override
    public double area(){ return Math.PI * r * r; }
}

// Rectangle.java
class Rectangle extends Shape {
    private double w, h;
    public Rectangle(double w, double h){ this.w=w; this.h=h; }
    @Override
    public double area(){ return w * h; }
}

// Triangle.java
class Triangle extends Shape {
    private double b, h;
    public Triangle(double b, double h){ this.b=b; this.h=h; }
    @Override
    public double area(){ return 0.5 * b * h; }
}

// ShapeDemo.java
public class ShapeDemo {
    public static void main(String[] args){
        Shape[] shapes = new Shape[] {
                new Circle(3),
                new Rectangle(4,5),
                new Triangle(3,6)
        };
        for(Shape s : shapes){
            System.out.printf("%s area = %.3f%n", s.getClass().getSimpleName(), s.area());
        }
    }
}

