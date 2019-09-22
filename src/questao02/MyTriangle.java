/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;


public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        String type;
        if(v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1) && v1.distance(v3) == v1.distance(v2)){
            type = "equilatero";
            return "MyTriangle" + "TYPE: " + type + "( " + this.v1.getX() + ", " + this.v1.getY() + "), " + "( " + this.v2.getX() + ", " + this.v2.getY() + "), " + "( " + this.v3.getX() + ", " + this.v3.getY() + ")";          
        }
        else if(v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v1.distance(v3) == v1.distance(v2)) {
            type = "isosceles";
            return "MyTriangle" + "TYPE: " + type + "( " + this.v1.getX() + ", " + this.v1.getY() + "), " + "( " + this.v2.getX() + ", " + this.v2.getY() + "), " + "( " + this.v3.getX() + ", " + this.v3.getY() + ")";          
        }
        else {
            type = "escaleno";
        }
        return "MyTriangle" + "TYPE: " + type + "( " + this.v1.getX() + ", " + this.v1.getY() + "), " + "( " + this.v2.getX() + ", " + this.v2.getY() + "), " + "( " + this.v3.getX() + ", " + this.v3.getY() + ")";          
    }
    
    public double getPerimeter() {
        double perimeter = this.v1.distance(v2) + this.v2.distance(v3) + this.v1.distance(v3);
        return perimeter;
    }

    public boolean equals(MyTriangle triangle) {
        if(triangle == null)
            return false;
        return this.v1.equals(triangle.v1) && this.v2.equals(triangle.v2) && this.v3.equals(triangle.v3);
    }
    
    
    
}
