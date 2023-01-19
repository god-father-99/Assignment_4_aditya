package ITER;
import java.util.Scanner;
public class Assignment_4_Q8 {
    public static void main(String[] args) {
        int max=10;
        int x=(int)(Math.random()*(max))+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int y;
        int i=x;
        System.out.println(x);
        do{
           y=sc.nextInt();
            if(y==x){
                System.out.println("computer guesses  "+x+"\nuser guesses  "+y+"\ngood guess");
            }
            else{
                System.out.println("computer guesses  "+x+"\nuser guesses  "+y+"\nToo low, try again");
            }
        }while(i!=y);
    }
}
