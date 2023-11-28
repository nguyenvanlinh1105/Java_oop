/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh_22225;

/**
 *
 * @author HP
 */
    
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
