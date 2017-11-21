package OOP.Novemper_15_11_2017;

import java.util.Vector;

public class Vector2D {

    private double x;
    private double y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D addvector) {
        Vector2D addvec = new Vector2D();
        addvec.x = addvector.x + x;
        addvec.y = addvector.y + y;
        return addvec;
    }

    public void add2(Vector2D add2vector){
        x = add2vector.x + x;
        y = add2vector.y + y;
    }

    public Vector2D sub(Vector2D subvector){
        Vector2D subvec = new Vector2D();
        subvec.x = subvector.x + x;
        subvec.y = subvector.y + y;
        return subvec;
    }

    public void sub2(Vector2D sub2vector){
        x = sub2vector.x + x;
        y = sub2vector.y + y;
    }

    public Vector2D mult(double multvector){
        Vector2D multvec = new Vector2D();
        multvec.x = x*multvector;
        multvec.y = y*multvector;
        return multvec;
    }

    public void mult2(double mult2vector){
        x = x*mult2vector;
        y = y*mult2vector;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double length(){
        double len;
        len = Math.sqrt(x*x + y*y);
        return len;
    }

    public double scalarProduct(Vector2D scalar){
        double sc;
        sc = scalar.x*x + scalar.y*y;
        return sc;
    }

    public double cos(Vector2D cosvector){
        double cosvec;
        cosvec = scalarProduct(cosvector) / (cosvector.length() * length());
        return cosvec;
    }
}
