package Bai4;

public class Rectangle extends Shape{
    private double width=1;
    private double length=1;

    public Rectangle(){
        
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }
    
}
