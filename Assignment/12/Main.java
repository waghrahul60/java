import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Basic Salary");
            float basic=sc.nextFloat();
            System.out.println("Enter the hra");
            float hra=sc.nextFloat();
            
            System.out.println("Enter the Da");
            float da=sc.nextFloat();

            if(basic < 10000)
            {
                da  = basic * 0.9F;
                hra = basic * 0.1F;
            }
            else if(basic >= 10000)
            {
                da  = basic * 0.98F;
                hra = 2000;
            }

            float gs=basic+da+hra;
            System.out.println("Gross salary = "+gs);
            
    }
}
