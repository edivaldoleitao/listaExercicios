/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;


public class MyPoint {
    int x = 0;
    int y = 0;

    public MyPoint() {
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        String s = "MyPoint( " + this.x + ", " + this.y + ")";
        return s;
    }

    public double distance(int x, int y) {
        int x1 = this.x - x;
        int y1 = this.y - y;
        double soma = Math.pow(x1, 2) + Math.pow(y1, 2);
        double distance = Math.pow(soma, (0.5));
        return distance;
    }

    public double  distance(MyPoint another) {
        double distancia = another.distance(this.x, this.y);
        return distancia;
    }

    public boolean equals(MyPoint ponto) {
        if(ponto == null )
            return false;
        return ponto.getX() == this.x && ponto.getY() == this.y;
    }
}
