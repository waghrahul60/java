import java.util.*;
class Student{
    int rollNo;
    int age;
    String name;
    int score;
    Student(int rollNo , int age , String name , int score){
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.score = score;
    }
}

class Main{
    public static void main(String[] args){
       Student arr[] = new Student[5];
       Scanner sc = new Scanner(System.in);
        int arrScore[] = new int[5];
       for (int i=0 ; i<arr.length ; i++){
           System.out.print("Enter the Name : ");
           String name = sc.next();

           System.out.print("Enter the Roll Number : ");
           int rollNo = sc.nextInt();
           
           System.out.print("Enter the Age : ");
           int age = sc.nextInt();

           System.out.print("Enter the score : " );
           int score = sc.nextInt();
            Student s = new Student(rollNo , age , name , score);
            arr[i] = s;
            arrScore[i] = arr[i].score;

       }
    System.out.println("asdfasdfsadfasfdadfasdfasfdadf"+arr[0].name);
       Arrays.sort(arrScore);
       for(int j = 0 ; j<arrScore.length ; j++){
           if(arrScore[j]>=0 && arrScore[j] <=50) {
               for(int m=0 ; m<arr.length ; m++){
                   if(arrScore[j]==arr[m].score){
                        System.out.println("\n\nGroup of [0-50] : SCORE "+arrScore[j]);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                   }
               }
           }
           if(arrScore[j]>50 && arrScore[j] <=65 ) {
               for(int m=0 ; m<arr.length ; m++){
                   if(arrScore[j]==arr[m].score){
                        System.out.println("\n\nGroup of [50-65] : SCORE "+arrScore[j]);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                   }
               }
           }
           if(arrScore[j]>65 && arrScore[j] <=80) {
               for(int m=0 ; m<arr.length ; m++){
                   if(arrScore[j]==arr[m].score){
                        System.out.println("\n\nGroup of [65-80] : SCORE "+arrScore[j]);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                   }
               }
           }
           if(arrScore[j]>80 && arrScore[j] <=100) {
              for(int m=0 ; m<arr.length ; m++){
                   if(arrScore[j]==arr[m].score){
                        System.out.println("\n\nGroup of [80-100] : SCORE "+arrScore[j]);
                        System.out.println("Name : "+arr[m].name);
                        System.out.println("Roll No : " + arr[m].rollNo);
                        System.out.println("Age : "+ arr[m].age);
                   }
               }
           }

           
       }    
    }
} 