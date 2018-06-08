import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,k, i,j,count=1;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int space=n-1;
        for (i = 1; i <= n; i++)
        {
            for(k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            space--;
            for(j=1;j<=count;j++)
            {
                System.out.print("*");
            }
            count+=2;
            System.out.println();
        }
    }
}
