package a3;

public class ComplexNumberImpl implements ComplexNumber {

    // Fields go here.
    private double _A;
    private double _B;

    final static double EQUALS_EPSILON = 2 * Double.MIN_VALUE;
    final static ComplexNumber I = new ComplexNumberImpl(0.0, 1.0);

    // Constructor
    public ComplexNumberImpl(double real,double imag) {
        _A = real;
        _B = imag;

    }

    // Instance methods go here.
    public double getReal() { return _A; }
    public double getImaginary() { return _B; }
    public double getAbsValue() {
        return Math.sqrt((_A * _A) + (_B * _B));
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double a = (this.getReal() * other.getReal()) - (this.getImaginary() * other.getImaginary());
        double b = ((this.getReal() * other.getImaginary()) + (other.getReal() * this.getImaginary()) );
        return new ComplexNumberImpl(a,b);
    }

    public ComplexNumber add(ComplexNumber other) {
        double a = (this.getReal() + other.getReal());
        double b = (this.getImaginary() + other.getImaginary());
        return new ComplexNumberImpl(a,b);
    }

    public boolean equals(ComplexNumber other) {
        boolean real_close_enough = (other.getReal() - this.getReal()) < EQUALS_EPSILON;
        boolean imaginary_close_enough = (other.getImaginary() - this.getImaginary()) < EQUALS_EPSILON;

        if (real_close_enough && imaginary_close_enough) {
            return true;
        }
        return false;
    }




}
