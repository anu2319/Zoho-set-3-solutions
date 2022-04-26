import java.util.Scanner;

public class Main1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int res[] = new int[n];
        int j = 0, k=0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {

            if(i%2==0)
            {
                even[j] = a[i];
                j++;
            }
            else
            {
                odd[k] = a[i];
                k++;
            }
        }

        for(int i=0; i<j-1; i++)
        {
            if(even[i]<even[i+1])
            {
                int temp = even[i+1];
                even[i+1] = even[i];
                even[i] = temp;
                i = -1;
            }
        }

        for(int i=0; i<k-1; i++)
        {
            if(odd[i]>odd[i+1])
            {
                int temp = odd[i+1];
                odd[i+1] = odd[i];
                odd[i] = temp;
                i = -1;
            }
        }
        int x = 0, y=0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                res[i] = even[x++];
            }
            else
            {
                res[i] = odd[y++];
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(res[i] + " ");
        }

    }

}
