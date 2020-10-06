//19.	Calculate  series : 12+22+32+42+.........+n2
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int n = sc.nextInt();
        int a=2;
        int b=0;
        int sum=0;

        for (int i=1; i<=n; i++){
            b = a + 10*i;
            sum = sum + b;
            System.out.print(b+" + ");
        }

        System.out.print(" = "+sum);

    }
}