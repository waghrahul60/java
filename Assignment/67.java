package IOPrackage;

import java.io.*;
public class ShoppingDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	  FileInputStream file1=new FileInputStream("E:\\core java\\dir\\Shopping.dat");
     //  Shopping1 shop =new Shopping1("Cloath",2000,2);
       ObjectInputStream obj1=new ObjectInputStream(file1);
  
        Shopping shop=(Shopping)obj1.readObject();
        System.out.println(shop);
        
       obj1.close();
       System.out.println("Successfully read Data from Shopping.dat file");
       file1.close();
	}

}