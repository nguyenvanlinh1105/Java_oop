package Bai4;

public class Circle extends Shape{
    private double radius= 1;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;// Diện tích hình tròn
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius; // Chu vi hình tròn
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
}
