class ComplexNum {
    int real, img;

    ComplexNum(int real, int img) {
        this.real = real;
        this.img = img;
    }

    void displayCompNumber() {
        System.out.println(real + "+" + img + "i");
    }

    ComplexNum addCompNumber(ComplexNum c) {
        return new ComplexNum(this.real + c.real, this.img + c.img);
    }
}
public class MainComplexNum {
    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(4, 3);
        ComplexNum c2 = new ComplexNum(5, 7);

        ComplexNum sum = c1.addCompNumber(c2);
        sum.displayCompNumber();
    }
}

