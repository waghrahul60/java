import java.util.*;
class Product{
    int pid;
    int price;
    int quantity;
    // int amt;
    static int a[] = new int[5];
    static int i=0;

    Product(int pid , int price , int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    void show(){
        System.out.println("Pid : "+pid+" Price : "+price+" Quantity : "+quantity);
    }
    static void amount(int price , int quantity){
        a[i] = price * quantity ;
      
        i++;
        // System.out.println("Total amount is : "+amt);
       
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product arr[] = new Product[5];
        int arrPrice[] = new int[5];
        for(int i=0 ; i<arr.length ; i++){
            System.out.print("Enter the Pid  of product : ");
            int pid = sc.nextInt();
            System.out.print("Enter the Price  of product : ");
            int price = sc.nextInt();
            System.out.print("Enter the Quantity  of product : ");
            int quantity = sc.nextInt();

            Product p = new Product(pid,price,quantity);
            arr[i]=p;
            arrPrice[i] = arr[i].price;
            Product.amount(arr[i].price , arr[i].quantity);
            

                       
        }
        int highestPrice = Arrays.stream(arrPrice).max().getAsInt();


        System.out.println("Highest Price is "+highestPrice);
        for(int k = 0 ; k<arrPrice.length ;k++){ // 4 = 500
            if(arrPrice[k]==highestPrice){
                System.out.println("Pid of highest Price is : "+arr[k].pid);
            }
        }
        
        for( Product j : arr) j.show();
       
        for ( int l=0 ; l<5; l++)
             System.out.println("Total amount of "+l+" : "+Product.a[l]);
    }
}