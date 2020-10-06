import java.util.*;
class Student{
    int rollno ;
    float percentage;

    Student(int rollno , float percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        //Information
        System.out.println("\n\nRoll NO is : "+rollno);
        System.out.println("Percentage is : "+percentage);
    }
}
class CollegeStudent extends Student{
    int semester ;
    CollegeStudent(int rollno , float percentage ,int semester){
        super(rollno,percentage);
        this.semester = semester;

    }
    void show(){
        super.show();
        System.out.println("Semester is : "+semester);
    }
}
class SchoolStudent extends Student{
    String className;
    SchoolStudent(int rollno , float percentage , String className){
        super(rollno , percentage);
        this.className = className;
    }
    void show(){
        super.show();
        System.out.println("Class Name is : "+className);
    }
}

class Main{
    public static void main(String[] agrs){
      

        CollegeStudent arrCollegeStudent[] = new CollegeStudent[2];
        SchoolStudent arrSchoolStudent[] = new SchoolStudent[3];

        int gradeCollegeStudent=0;
        int gradeSchoolStudent=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0 ; i<arrCollegeStudent.length ; i++){
            System.out.print("\n\nEnter the Roll Number of Collage Student : ");
            int rollno =  sc.nextInt();
            System.out.print("Enter the Percentage of Collage Student : ");
            float percentage =  sc.nextFloat();
            System.out.print("Enter the Semester of Collage Student : ");
            int semester =  sc.nextInt();
            CollegeStudent cs = new CollegeStudent(rollno , percentage , semester );
            arrCollegeStudent[i] = cs;

            if(percentage >= 75) gradeSchoolStudent++;

        }

        for(int j=0 ; j<arrSchoolStudent.length ; j++){
            System.out.print("\n\nEnter the Roll Number of School Student : ");
            int rollno = sc.nextInt();
            System.out.print("Enter the Percentage of School Student : ");
            float percentage = sc.nextFloat();
            System.out.print("Enter the Class Name of School Student : ");
            String className = sc.next();
            SchoolStudent ss = new SchoolStudent(rollno , percentage , className);
            arrSchoolStudent[j] = ss;

            if(percentage >= 75) gradeSchoolStudent++;
        }
        for(CollegeStudent p : arrCollegeStudent) p.show();
        for(SchoolStudent q : arrSchoolStudent) q.show();

        System.out.print("Enter the Roll Number fo Seraching : ");
        int searchRollNo = sc.nextInt();
        byte flag = 1;
        for(int i=0 ; i < arrCollegeStudent.length ; i++){
            if(searchRollNo == arrCollegeStudent[i].rollno){
                System.out.println("Student is of College Student !!");
                flag = 0;
                break;
            }
            else{
                for(int j=0 ; j< arrSchoolStudent.length ; j++){
                    if(searchRollNo == arrSchoolStudent[i].rollno){
                        System.out.println("Student is of Scholl Student !!");
                        flag = 0;
                        break;
                    }
                   
                }
            }
        }
        if(flag == 1) System.out.println("Student Roll Number is Not Valid !!");
        int greadAStudent = gradeCollegeStudent+gradeSchoolStudent;
        System.out.println("Students are having A grade : "+greadAStudent);
    }
}