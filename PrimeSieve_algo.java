package Arrays;

public class PrimeSieve_algo {
    public static void main(String[] args) {
        //Prime seive is an algo
        //This efficiently generate all the prime numbers upto
        //a specified limit or b/w range

        //Steps:
        //1.We need a boolean array isPrime[] where each index represent if number is prime or not
        
        //2.Initially mark all the numbers from 2 to n as true;

        //3.Starting from the first prime(2) mark all the muntiples of 2 as false

        //4.Move to th next memeber that is still mark true and mark its all multiples as false.

        //5.Continue this until you reach the square root of n.

        int n = 100;
        seive(n);
    
    }

    public static void seive(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int p=2;p*p<=n;p++)
        {
           if(isPrime[p]){
            for(int i = p*p ; i<=n;i+=p)
            { 
                isPrime[i] = false;

            }
           }
        }

        System.out.println("Prime numbers are");
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.println(i+" ");
            }
        }
    }
}
