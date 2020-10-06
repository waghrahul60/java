class Student{
    private int rno;
    private String name;
    void setData(int rno , String name){
        this.rno = rno;
        this.name = name;
    }
    void showData(){
        System.out.println("Roll No. : "+rno+"\nName : "+name);
    }
}
class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.setData(1,"Mohit");
        s.showData();
    }
}