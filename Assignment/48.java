import java.util.*;
abstract class Processor {
    int data;
    abstract void process();
    void showData(int data){
        System.out.println("Data : "+data);
    }
}
class Factorial extends Processor{
    void process(){
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        int sum = 1;
        for(int i = 1 ; i <= data ; i++){
            sum = sum*i;
        }
        // System.out.println("Fectorial is : "+sum);
        showData(sum);
    }
}
class Circle extends Processor{
    void process(){
        System.out.print("Enter the Radius : ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();

        final float PI = 3.14F;
        int pi = (int)PI;
        int areaOfCircle = pi*data*data;
        showData(areaOfCircle);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Factorial \n2. Area of Circle ");
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                Processor p = new Factorial();
                p.process();
                break;
            case 2:
                Processor p1 = new Circle();
                p1.process();
                break;
            default :
                System.out.println("You Have Entered Wrong Choice !!");
        }
    }
}