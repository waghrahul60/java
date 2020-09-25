import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Days");
            int days=sc.nextInt();
            int year=days/365;
            
            days=days%365;
            
            int month=days/30;
            days=days%30;


            System.out.println("Year = "+ year);
            System.out.println("month = "+ month);
            System.out.println("Days = "+ days);
    }
}
