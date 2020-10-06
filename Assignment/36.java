import java.util.*;
class MathOperation{
  
    static int multiply(int a , int b){
        return a*b;
    }
    static float multiply(float a, float b, float c){
        return a*b*c;
    }
    static int multiply(int[] arr){
        int sum = 1;
        for(int i=0; i<arr.length; i++){
            sum = sum * arr[i];
        }
        return sum;
    }
    static double multiply(double a , int b){
        return a*b;
    }
}

class Main{
    public static void main(String[] args){
        System.out.println("Method A is : "+ MathOperation.multiply(10,20));
        System.out.println("Method B is : "+ MathOperation.multiply(10.11f,20.22f,33.33f));
        int arr[] = {1,2,3,4,5};
        System.out.println("Method C is : "+ MathOperation.multiply(arr));
        System.out.println("Method D is : "+ MathOperation.multiply(10.12,20));
    }
}