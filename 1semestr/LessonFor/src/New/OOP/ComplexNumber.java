package New.OOP; // из учебника Абрамского

public class ComplexNumber {
    private double a;
    private double bi;

    public ComplexNumber() {
        this.a = 0;
        this.bi = 0;
    }

    public ComplexNumber(double a, double bi) {
        this.a = a;
        this.bi = bi;
    }

    public ComplexNumber add(ComplexNumber addcompltx) {
        ComplexNumber addcom = new ComplexNumber();
        addcom.a = addcompltx.a + a;
        addcom.bi = addcompltx.bi + bi;
        return addcom;
    }

    public void add2(ComplexNumber add2complex) {
        a = add2complex.a + a;
        bi = add2complex.bi + bi;
    }

    public ComplexNumber sub(ComplexNumber subcomplex) {
        ComplexNumber subcom = new ComplexNumber();
        subcom.a = subcomplex.a + a;
        subcom.bi = subcomplex.bi + bi;
        return subcom;
    }

    public void sub2(ComplexNumber sub2complex) {
        ComplexNumber sub2com = new ComplexNumber();
        a = sub2complex.a + a;
        bi = sub2complex.bi + bi;
    }

    public ComplexNumber multNumber(double multnumber) {
        ComplexNumber multcom = new ComplexNumber();
        multcom.a = multnumber * a;
        multcom.bi = multnumber * bi;
        return multcom;
    }

    public void multNumber2(double mult2number) {
        a = mult2number * a;
        bi = mult2number * bi;
    }

    public ComplexNumber mult(ComplexNumber multcomplex) {
        ComplexNumber multcom = new ComplexNumber();
        multcom.a = a * (multcomplex.a + multcomplex.bi);
        multcom.bi = bi * (multcomplex.a + multcomplex.bi);
        return multcom;
    }

    public void mult2(ComplexNumber mult2complex) {
        a = a * (mult2complex.a + mult2complex.bi);
        bi = bi * (mult2complex.a + mult2complex.bi);
    }

    public ComplexNumber div(ComplexNumber divcomplex) {
        ComplexNumber divcom = new ComplexNumber();
        divcom.a = a / (divcomplex.a + divcomplex.bi);
        divcom.bi = bi / (divcomplex.a + divcomplex.bi);
        return divcom;
    }

    public void div2(ComplexNumber div2complex) {
        a = a / (div2complex.a + div2complex.bi);
        bi = bi / (div2complex.a + div2complex.bi);
    }

    public double length() {
        double len;
        len = Math.sqrt(a * a + bi * bi);
        return len;
    }

    public String toString() {
        return bi + "*i " + a;
    }

    public double arg() {
        double arg;
        arg = Math.atan(bi / a);
        return arg;

    }



}
