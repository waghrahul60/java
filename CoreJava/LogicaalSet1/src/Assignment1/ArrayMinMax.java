package Assignment1;

import java.util.Scanner;

public class ArrayMinMax {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t >= 0) {

			int n = scanner.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n ; i++) {
		    	arr[i] = scanner.nextInt();
		    }
		    int min =arr[0];
			int max =arr[1];
		    
		    	for(int i=1; i<n; i++) {
			    	if(arr[i] < min) {
			    		min = arr[i];
			    	}
			    	
			    	if(arr[i] > max) {
			    		max = arr[i];
			    	}
			    }
			System.out.println(min+" "+max);
			scanner.close();
		}
		    
	}
}

