package ITER;
import java.util.Scanner;
public class Assignment_4_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int n = sc.nextInt();
        int idx = 0;
        int newNum = 0;
        int i = n;
        while (i != 0) {
            int d = i % 10;
            if (d != 0) {
                newNum += (int)(d * Math.pow(10, idx));
                idx++;
            }
            i /= 10;
        }

        System.out.println("Original number = " + n);
        System.out.println("New number = " + newNum);
    }
}
