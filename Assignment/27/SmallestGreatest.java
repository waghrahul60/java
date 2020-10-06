//27.	Write a program to fine the smallest and greatest number pr
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt(); 
        int arr[] = new int[n];

        int smallest; 
        int greatest; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        smallest = arr[0];
        greatest = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>greatest){
                greatest = arr[i];
            }else if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Greatest no is : "+greatest);
        System.out.println("Smallest no is : "+smallest);

       
    }
}