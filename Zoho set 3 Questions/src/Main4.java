import java.util.Scanner;

public class Main4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A1 = new int[n];
        int[] A2 = new int[m];
        int s = 0;
        if(n > m)
        {
            s = n;
        }
        else
        {
            s = m;
        }
        int[] res = new int[100];

        for(int i=0; i<n; i++)
        {
            A1[i] = sc.nextInt();
        }

        for(int j=0; j<m; j++)
        {
            A2[j] = sc.nextInt();
        }

        int x = 0, y = 0, k=0;
        while(x<n && y<m)
        {
            if(A1[x] == A2[y])
            {
                res[k++] = A1[x];
                x++;
                y++;
            }
            else if(A1[x] > A2[y])
            {
                res[k++] = A2[y];
                y++;
            }
            else if(A1[x] < A2[y])
            {
                res[k++] = A1[x];
                x++;
            }
        }

        while(y<m)
        {
            res[k++] = A2[y];
            y++;
        }
        while(x<n)
        {
            res[k++] = A1[x];
            x++;
        }


        for(int i=0; i<k; i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
