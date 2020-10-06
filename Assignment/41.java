class Employee{
    int empNo;
    String empName;
    Employee(){
        System.out.println("no arg Parameter");
    }
    Employee(int empNo , String empName){
        this();
        this.empNo = empNo;
        this.empName = empName;
    }
    void show(){
        // this();
        System.out.println("Emp No is : "+empNo + "\nEmp Name : "+empName);
    }
}
class Main{
    public static void main(String[] args){
        Employee e = new Employee(1,"Mohit");
        e.show();
    }
}