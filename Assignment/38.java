class Employee{
    static int empNo;
    int salary;
    static int totalSalary;

    Employee(int salary){
        empNo++;
        this.salary = salary;
        this.totalSalary = totalSalary+salary;
    }

    void display(){
        System.out.println("Total employee is : "+empNo);
        System.out.println("Total Salary is : "+totalSalary);
    }

}
class Main{
    public static void main(String[] args){
        Employee e1 = new Employee(1000);
        Employee e2 = new Employee(2000);
        Employee e3 = new Employee(3000);
        Employee e4 = new Employee(4000);
        e1.display();

    }
}