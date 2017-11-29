package New.OOP; // задача 50

public class RationalFraction {
    private int a;
    private int b;

    public RationalFraction() {
        this.a = 0;
        this.b = 0;
    }

    public RationalFraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void reduce() {
        while (this.a != 0 || this.b != 0 ) {
            if (this.a < this. b) {
                this.a = this.a % this.b;
            }
            else {
                this.b = this.b % this.a;
            }
        }
    }

    public RationalFraction add(RationalFraction addfraction) {
        RationalFraction addfr = new RationalFraction();
        addfr.a = addfraction.a*b + a*addfraction.b;
        addfr.b = addfraction.b*b;
        reduce();
        return addfr;
    }

    public void add2(RationalFraction add2fraction) {
        a = add2fraction.a*b + a*add2fraction.b;
        b = add2fraction.b*b;
        reduce();
    }

    RationalFraction sub(RationalFraction subfraction) {
        RationalFraction suffr = new RationalFraction();
        suffr.a = subfraction.a*b - a*subfraction.b;
        suffr.b = subfraction.b*b;
        reduce();
        return suffr;
    }

    public void sub2 (RationalFraction sub2fraction) {
        a = a*b - a*sub2fraction.b;
        b = b*sub2fraction.b;
        reduce();
    }

    public RationalFraction mult(RationalFraction mult) {
        RationalFraction m = new RationalFraction();
        m.a = mult.a*a;
        m.b = mult.b*b;
        reduce();
        return m;
    }

    public void mult2(RationalFraction mult2) {
        a = mult2.a*a;
        b = mult2.b*b;
        reduce();
    }

    public RationalFraction div(RationalFraction div) {
        RationalFraction divnew = new RationalFraction();
        divnew.a = div.a * b;
        divnew.b = div.b * a;
        reduce();
        return divnew;
    }

    void div2 (RationalFraction div2) {
        a = div2.a * b;
        b = div2.a * a;
        reduce();
    }

    public String toString() {
        return   a + "/" + b;
    }

    public double value() {
        double v;
        v = a / b;
        return v;
    }

    public int numberPart() {
        int n;
        n = a / b;
        return n;
    }






}

