import java.util.Scanner;

public class Main5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        int sl = s.length();
        int j;
        int s1l = s1.length();

        for(int i=0; i<=sl-s1l; i++)
        {
            for(j=0; j<s1l; j++)
            {
                if(s.charAt(i+j)!=s1.charAt(j))
                {
                    break;
                }
            }
            if(j==s1l)
            {

                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
}
