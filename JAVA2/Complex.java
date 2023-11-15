//Print the sum , difference and product of two complex numbers by creating a classnamed 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user

public class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex difference(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(5, 2);

        Complex sum = Complex.add(c1, c2);
        Complex diff = Complex.difference(c1, c2);
        Complex prod = Complex.product(c1, c2);

        sum.printComplex();
        diff.printComplex();
        prod.printComplex();
    }
}
