/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh_22225;

/**
 *
 * @author HP
 */
public class Square extends Rectangle{

    public Square(double size, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);

    }
    public Square(double width, double length) {
        super(width, length);
    }
    
    public Square(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    public void  setWidth(double width){
        super.setWidth(width);
    }
    public void setHeight(double height){
        super.setLength(height);
    }
    
    @Override
    public double getArea() {
        return Math.pow(super.getWidth(), 2);
    }

    @Override
    public double getPerimeter() {
        return super.getWidth()*4;
    }    
    
}
