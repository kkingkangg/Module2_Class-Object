import java.util.Scanner;
public class Rectangle {
    double width, height;

//    public Rectangle () {
//
//    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width+this.height)*2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double r = input.nextDouble();
        double d = input.nextDouble();
        Rectangle hcn = new Rectangle(r,d);
        System.out.println("Your Rectangle \n"+ hcn.display());
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());
    }
}
