/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

public class TestMyTriangle {

    
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(0, 0, 2, 0, 1, 3);
        System.out.println("triangle: " + triangle);
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(2, 0);
        MyPoint v3 = new MyPoint(1, 3);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);
        System.out.println("triangle2: " + triangle2);
        System.out.println("triangle == triangle2: " + triangle.equals(triangle2));
        v1.setX(5);
        System.out.println("triangle: " + triangle);
        System.out.println("triangle2: " + triangle2);
        System.out.println("triangle == triangle2: " + triangle.equals(triangle2));  
    }
    
}
