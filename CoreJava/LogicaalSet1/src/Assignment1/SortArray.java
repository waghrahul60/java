package Assignment1;

import java.util.Scanner;

class SortArray {
public static void main (String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while(t >= 0){
//            int count = 0;
//            int n = scanner.nextInt();
//            int arr[] = new int[n];
//            
//            for(int i=0; i<n; i++){ 
//                arr[i] = scanner.nextInt();
//                } 
//                
//            int x = scanner.nextInt();
//            
//            for(int i=0; i<n; i++){ 
//                    if(arr[i] <= x)
//                        count++;
//                }
//                System.out.println(count);
//        } 
//        scanner.close();
	
			
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while( t >= 0) {
			int count = 0;
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int x = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				if(arr[i] <= x){
					count++;
				}
			}
			System.out.println(count);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
            
     } 
}