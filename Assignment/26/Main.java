import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int b[] ={6,7,8,9};
        int c[] ={11,12,13,14};
        int d[] ={16,17,55,77};
        int e[] ={88};

        int arr[][] = new int[5][];

        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        arr[4]=e;

        System.out.println(arr.length);


        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
                sum = sum + arr[i][j];
                
            }
            System.out.println(" ");
            System.out.println(sum);
        }
        
    }
}