import java.util.*;

class rahul{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A : ");
        byte a = sc.nextByte();
        System.out.println("Enter the Value of B : ");
        byte b = sc.nextByte();

        byte c = (byte) (a + b);
        System.out.println("Sum : "+c);
    }
}