package Assignment1;

import java.util.Scanner;

public class ArraySecondLargest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int arr[] = new int[n];
	    
	    for(int i=0; i<n ; i++) {
	    	arr[i] = scanner.nextInt();
	    }
	    
	    int largest =arr[0];
		int secondLrgest =arr[1];
	    for(int i=1; i<n; i++) {
	    	if(largest < arr[i]) {
	    		secondLrgest = largest;
	    		largest = arr[i];
	    	}else if (arr[i] < largest && arr[i] > secondLrgest && largest != secondLrgest) {
	    		secondLrgest = arr[i];
	    	}
	    }
	    System.out.println(secondLrgest+" "+largest);
	    scanner.close();
	}
}
