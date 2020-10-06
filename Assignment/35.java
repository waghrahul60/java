import java.util.*;
class MathOperation{
    int a;
    int b;

    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    // static int[] power(int a, int b){
    //     int arr[] = new int[2];
    //     arr[0]=a*a;
    //     arr[1]=b*b;
    //     return arr;
    // }
    static int power(int a, int b){
        int sum=1;
        for(int i=1; i<=b ; i++){
           sum = sum*a;
        }
        return sum;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        int add = MathOperation.add(a,b);
        System.out.println("Additon of two Number is : "+add);

        System.out.println("Subtraction of two Number is : "+ MathOperation.sub(a,b));
        
        System.out.println("Multiplication of two Number is : "+ MathOperation.mul(a,b));

        // int arr[] = MathOperation.power(a,b);
        // System.out.println("Power of Frist Number is : "+arr[0]);
        // System.out.println("Poser of Second Number is : "+arr[1]);

        System.out.println("Power of First number to Second is : "+ MathOperation.power(a,b));
    }
}