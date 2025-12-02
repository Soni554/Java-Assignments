import java.util.Scanner;

class Complex {
    int real, imag;

    void initialise() {
        Scanner sc = new Scanner(System.in);
        real = sc.nextInt();
        imag = sc.nextInt();
    }

    void show() {
        System.out.println(real + " + " + imag + "i");
    }

    Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real + c.real;
        temp.imag = this.imag + c.imag;
        return temp;
    }
}
public class MainComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        c1.initialise();
        c2.initialise();

        Complex sum = c1.add(c2);
        sum.show();
    }
}


