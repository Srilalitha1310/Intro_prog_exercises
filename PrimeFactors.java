import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static ArrayList<Integer> generate(int n)
    {
        int i;
        ArrayList<Integer> al1= new ArrayList<Integer>();
        if(n==1)
            return al1;
        else
        {
            for(i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                    al1.add(i);
            }
        }
        return al1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        al2 = generate(n);
        for(int i:al2)
        {
            System.out.println(i);
        }
    }
}
