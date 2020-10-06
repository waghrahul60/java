import java.util.*;
interface Taxable{
    double salesTax = 7D;
    double incomeTax = 10.5D;
    void calcTax();
}
class Employee implements Taxable{
    int empId;
    String name;
    double salary;
    Employee(int empId , String name , double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void calcTax(){
        double empIncomeTax = salary*incomeTax/100;
        System.out.println("Income tax of employee is : "+empIncomeTax);
    }

}
class Product implements Taxable{
    int pid;
    double price;
    int quantity;
    Product(int pid , double price , int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public void calcTax(){
        double pSaleTax = price*quantity*salesTax/100;
        System.out.println("Sale tax of Product is : "+pSaleTax);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter  Employee Id : ");
        int empId = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        String name = sc.next();
        System.out.print("Enter Employee Salary : ");
        double salary = sc.nextDouble();

        Employee e = new Employee(empId , name , salary);
        e.calcTax();

        System.out.print("\n\nEnter Product Pid : ");
        int pid = sc.nextInt();
        System.out.print("Enter Product Price : ");
        double price = sc.nextDouble();
        System.out.print("Enter Product Quantity : ");
        int quantity = sc.nextInt();

        Product p = new Product(pid,price,quantity);
        p.calcTax();
    }
}