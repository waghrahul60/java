import java.util.*;
class Circle{
    int  radius;
    double area;
    void init(int radius){
        this.radius = radius;
    }
    void calculateArea(){
        this.area = 3.14*radius*radius;

    }
    void display(){
        System.out.println("Radius is : "+radius);
        System.out.println("Area of cirle is : "+String.format("%.5f", area));
       
    }
}
class CircleDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        int radius = sc.nextInt();

        Circle c = new Circle();
        c.init(radius);
        c.calculateArea();
        c.display();
    }
}