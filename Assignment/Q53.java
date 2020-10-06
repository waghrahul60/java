package Assignment8;

public class Q53 {

	public static void main(String[] args) {
		String s="67,89,23,67,12,55,66";
		
		
				
		String [] str=s.split(",");
		int sum=0;
		for(String a : str)
		{
			
		   int b=Integer.parseInt(a);
		    sum=sum +b;
		 
        }
		  System.out.println("sum of integer values : "+sum);
	}

}
