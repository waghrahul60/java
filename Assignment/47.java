import java.util.*;
class Person{
   Person(){
       this(45);
       System.out.println("no arg Person ");
   }
    Person(int i){
       System.out.println("param arg Person ");
   }
}
class Employee extends Person{
    Employee(){
        this(12);
        System.out.println("no agr Employee ");
    }
    Employee(int i){
        System.out.println("param agr Employee ");
    }
}


class Main{
    public static void main(String[] args){
        // Employee e = new Employee();
        Employee e1 = new Employee(1);
    }
}
