package Assignment1;

import java.util.Scanner;

public class SumOfElementsArray {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t >= 0){
            int sum = 0;
            int n = scanner.nextInt();
            int arr[] = new int[n];
            
            for(int i=0; i<n; i++){ 
                arr[i] = scanner.nextInt();
                	sum = sum + arr[i];
                } 
             System.out.println(sum);
        } 
        scanner.close();
            
     } 
}
