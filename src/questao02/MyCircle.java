/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;


public class MyCircle {

    private MyPoint center;
    private int radius = 1;

    public  MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public  void setRadius(int radius) {
        this.radius = radius;
    }
    
    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX() {
        return this.center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }
    
    public void  setCenterXY(int x,  int y) {
        this.center.setXY(x, y);
    }
    
    public double getArea() {
        return (Math.PI)*(Math.pow(this.radius, 2));
    }
    
    @Override
    public String toString() {
        String s = "Circle @( " + this.center.getX() + ", " + this.center.getY() + ") radius = " + this.radius + "; area = " + (Math.PI)*(Math.pow(this.radius, 2)) ;
        return s;
    }
    
    public  boolean equals(MyCircle circle) {
        if(circle == null)
            return false;
        return this.center.equals(circle.getCenter()) && this.radius == circle.getRadius();        
    }
    
    
    
    
    
}
