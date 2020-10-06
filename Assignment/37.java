class Person{
    int age=18;
    String name;
    Person(int age ,String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println("Age of Person : "+age);
        System.out.println("Name of Person : "+name);
    }

}

class Main{
    public static void main(String[] args){
        Person p = new Person(23,"Mohit");
        p.display();
    }
}