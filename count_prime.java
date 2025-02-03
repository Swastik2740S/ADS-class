package Arrays;

public class count_prime {
    public static void main(String[] args) {
        int  l =10;
        int r =30;
        System.out.println(countp(l, r));
    }

    public static int countp(int l ,int r)
    {
        int[] prime = new int[r+1];
        for(int i=0;i<=r;i++)
        {
            prime[i] = 1;
        }

        prime[0]=prime[1] = 0;

        for(int i=2;i*i<=r;i++)
        {
            if(prime[i]==1)
            {
                for(int j = i*i; j<=r ;j+=i)
                {
                    prime[j] = 0;
                }
            }
        }

        int count = 0;
        for(int i=l;i<=r;i++)
        {
            if(prime[i]==1)
            {
                count++;
            }
        }

        return count;
    }
}
