package net.idrok.Masalalar;

public class Complex {
    //masala-129

    private double real;
    private double img;

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double getReal() {
        return this.real;
    }

    public double getImg() {
        return this.img;
    }

    public void add(Complex complex) {
        real += complex.getReal();
        img += complex.getImg();
    }

    public static Complex sum(Complex x, Complex y) {
        return new Complex(x.real + y.real, x.img + y.img);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
}
