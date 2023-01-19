package ITER;
import java.util.Scanner;
public class Assignment_4_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       int sum=0;
        int i;
        for( i=1;i<x;i++){
            if(x%i==0){
                sum+=i;
//                System.out.println(i);

                }
            }
        if (sum==x){
            System.out.print(x+" is a perfect number as  "+i+"="+x);
        }
        else{
            System.out.println(x+" is not a perfect number as");
        }

    }
}
