/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

public class TestMyPoint {

   
    public static void main(String[] args) {
        MyPoint ponto = new MyPoint(2, 2);
        MyPoint ponto2 = new MyPoint(2, 2);
        
        System.out.println("distancia entre os pontos eh: " + ponto.distance(ponto2));
        System.out.println("distancia entre o ponto (1,0) e o ponto2 eh: " + ponto2.distance(1, 0));
        
        
        
        System.out.println("ponto: " + ponto + ",ponto2: " + ponto2);
        System.out.println("ponto == ponto2 :" + ponto.equals(ponto2));
        ponto.setX(0);
        System.out.println("ponto: " + ponto + "ponto 2: " + ponto2);
        System.out.println("ponto == ponto2 :" + ponto.equals(ponto2));
        
        
        MyPoint[] point = new MyPoint[10];
        for(int i = 0; i < 10; i++) {
            point[i] = new MyPoint(i + 1, i + 1);
        }
    
        for(int i = 0; i < 10; i++) {
            System.out.println(point[i]);
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
