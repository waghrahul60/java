class Employee{
    private int empId;
    private String empName;
    void set(int empId , String empName){
        System.out.println("this : "+this);
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
        // System.out.println("this : "+this);
        System.out.println("EmpId : " +empId+ "\nName : " +empName);
    }

}

class Main{
    public static void main(String[] args){
    
       Employee e;
       e = new Employee();
       System.out.println("e : "+e);
    //    e : Employee@15db9742 => className reference value
       e.set(101 , "Mohit");
       e.show();

       Employee  e1 = new Employee();
       System.out.println("e : "+e1);
       e1.set(102 , "Deepak");
       e1.show();
        e.show();
    }
}