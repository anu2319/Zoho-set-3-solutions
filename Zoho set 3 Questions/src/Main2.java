import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        for(int i=0; i<len; i++)
        {
            int j = len-1-i;
            for(int k=0; k<len; k++)
            {
                if(k==i)
                {
                    System.out.print(s.charAt(i));
                }
                else if(k==j)
                {
                    System.out.print(s.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
