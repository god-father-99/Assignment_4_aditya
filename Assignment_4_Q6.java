package ITER;
import java.util.Scanner;
public class Assignment_4_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int x=sc.nextInt();
        System.out.println("Enter a no. to the power");
        int y=sc.nextInt();
        int ans=1;
        for(int i=1;i<=y;i++){
             ans=ans*x;
        }
        System.out.println(x+" to the power "+y+" is "+ans);
    }
}
