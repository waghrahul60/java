class Person{
    void getDetail(){
        System.out.println("Person Details !!");
    }
    void getJob(){
        System.out.println("Person Job !!");
    }
}
class Employee extends Person{
    void getJob(){
        System.out.println("Employee Job !!");
    }
    void getDept(){
        System.out.println("Employee Dept !!");
    }
}

class Main{
    public static void main(String[] args){
        // Employee e = new Employee();
        Person p = new Employee();
        Employee e1 = (Employee)p;
        // Person arr[];
        e1.getDept();
        Person arr[] =  {new Employee() , new Person()};
        for(Person i : arr){
            if(i instanceof Employee){
                Employee e = (Employee)i;
                e.getDept();
            }
        }
    }
}