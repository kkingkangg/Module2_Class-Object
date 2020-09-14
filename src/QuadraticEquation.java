import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) { this.a=a; }
    public double getA() {
        return this.a;
    }

    public void setB(double b) { this.b=b;}
    public double getB() {
        return this.b;
    }

    public void setC(double c) { this.c=c; }
    public double getC() {
        return this.c;
    }


    public double getDiscriminant(double a, double b, double c) {
        double delta= (Math.pow(this.b,2)-4*this.a*this.c);
        System.out.println("Delta = " + delta);
        return delta;
    }


    public void getRoot(double delta) {
        double x1;
        double x2;
        if(delta>0) {
            x1 = (-this.b - Math.sqrt(delta))/ (2*this.a);
            x2 = (this.b - Math.sqrt(delta))/ (2*this.a);
            System.out.print("Roots of the equation is: x1 = " + x1 + ", x2 = " + x2);
            return;
        } else if (delta == 0) {
            x1 = (-this.b / (2*this.a));
            System.out.println("Roots of the equation is: x1 = x2 = " + x1);
            return;
        } else {
            System.out.println("The equation has no roots");
            return;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double d = equation.getDiscriminant(a,b,c);
        equation.getRoot(d);
    }


}
