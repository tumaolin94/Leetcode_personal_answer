//Description:
//Count the number of prime numbers less than a non-negative number, n.

class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        int count = n/2;
        boolean[] notprime = new boolean[n];
        
        for(int i=3; i * i<n;i=i+2){
            if(notprime[i]==false){
                for(int j=i*i;j<n;j+=i*2){
                    System.out.println(j);
                if(!notprime[j]){
                    count--;
                    notprime[j]=true;
                }
            }
            }

        }
        
        return count;
    }

}
