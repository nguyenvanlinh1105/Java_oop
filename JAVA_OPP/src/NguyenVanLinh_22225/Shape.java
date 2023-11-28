/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenVanLinh_22225;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public abstract class Shape {
    private String Color;
    private boolean filled;
    protected Scanner sc;

    public Shape(String Color, boolean filled) {
        this.Color = Color;
        this.filled = filled;
    }

    public Shape() {
        sc = new Scanner(System.in);
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" + "Color=" + Color + ", filled=" + filled + '}';
    }
    
    
}
