class Student{
    private int rno;
    private String name;
    private static int count;
    Student(){
              count++;
    }
    void setData(int rno , String name){
        this.rno = rno;
        this.name = name;
      
    }
    void showData(){
        System.out.println("Roll No. : "+rno+"\nName : "+name);
    }
    void countStudent(){
        System.out.println("Count of Student is : "+count);
    }
}
class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.setData(1,"Mohit");
        s.showData();

        Student s1 = new Student();
        s1.setData(11,"Kunal");
        s1.showData();

        Student s2 = new Student();
        s2.setData(111,"Kalpesh");
        s2.showData();

        s2.countStudent();
            
        


    }
}