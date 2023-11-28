/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh_22225;

/**
 *
 * @author HP
 */
public class Circle extends Shape{
    private double radius=1;

    public Circle(double radius, String Color, boolean filled) {
        super(Color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        String s= super.toString();
        return s+"Circle{" + "radius=" + radius + '}';
    }
    
}
