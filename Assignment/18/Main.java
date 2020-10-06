//18.	Program to check whether number is prime or not.

import java.util.Scanner;

class Main{
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        byte flag = 1;
        if (no <=1){
            flag=0;
        }
        for (int i=2;i<=no;i++){
            if(no%i != 0){
                flag=0;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Prime NO");
        }else{
            System.out.println("Not Prime NO");

        }
    }
}