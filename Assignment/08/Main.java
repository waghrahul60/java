import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        int time = sc.nextInt();
        float rate =  sc.nextFloat();

        double SI=(Amount*time*rate)/100;
        System.out.format("Simple Intrest = %.3f",SI);
    }
}