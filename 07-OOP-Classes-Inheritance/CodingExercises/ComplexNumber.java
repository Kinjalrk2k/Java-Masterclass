public class ComplexNumber {
    // write code here
    
    private double real;
    private double imaginary;
    
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public double getReal() {
        return this.real;
    }
    
    public double getImaginary() {
        return this.imaginary;
    }
    
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    
    public void add(ComplexNumber c) {
        this.add(c.real, c.imaginary);
    }
    
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    
    public void subtract(ComplexNumber c) {
        this.subtract(c.real, c.imaginary);
    }
}