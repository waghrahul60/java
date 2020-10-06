package IOPrackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shopping implements Serializable{
	private String itemName;
	private double price;
	private int quantity;
	
	public Shopping(String itemName,double price,int quantity) {
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		return "itemName = "+itemName+", Price = "+price*quantity+", Quantity = "+quantity;
	}
}

public class ShoppingDemo {

	public static void main(String[] args) throws IOException {
	   FileOutputStream file=new FileOutputStream("E:\\core java\\dir\\Shopping.dat");
       Shopping shop1 =new Shopping("Cloath",2000,3);
       ObjectOutputStream obj=new ObjectOutputStream(file);
      
    	   obj.writeObject(shop1);

       System.out.println("Data Added into Shopping.dat file");
       obj.close();
       file.close();
	}

}