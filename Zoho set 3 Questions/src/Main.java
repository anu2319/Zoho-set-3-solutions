import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int num = 0;
        String ans = "";
        char x = 0;
        for(int i=0; i<len; i++)
        {
            char c = s.charAt(i);
            if(!Character.isDigit(c))  x = s.charAt(i);
            if(Character.isDigit(c))
            {
                num = s.charAt(i) - '0';
                while(i+1<len && Character.isDigit(s.charAt(i+1)))
                {
                    num = num*10 + s.charAt(i+1)-'0';
                    i++;
                }
                for(int j=0; j<num; j++)
                {
                    ans+=x;
                }
            }
        }
        System.out.println(ans);
    }
}
