/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

public class TestMyCircle {
    
    public static void main(String[] args) {
        
        MyCircle circle = new MyCircle(2, 2, 1);
        MyPoint center = new MyPoint(2, 2);
        MyCircle circle2 = new MyCircle(center, 1);
        System.out.println("circle: " + circle + " circle2: " + circle2);
        System.out.println("circle == circle2: " + circle.equals(circle2));
        circle.setCenterXY(3, 1);
        System.out.println("circle: " + circle + " circle2: " + circle2);
        System.out.println("circle == circle2: " + circle.equals(circle2)); 
    }
}
