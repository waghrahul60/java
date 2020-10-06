package Assignment8;

public class Q57 {

	public static void main(String[] args) {
		String str="Welcome to java";
		
		String S[]=str.split(" ");  
	    String reverseWord="";  
	    for(String w : S){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    
	    System.out.println("output : "+reverseWord);
	}

}
