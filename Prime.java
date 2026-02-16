/*
Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
*/
  
class Prime {
    static boolean isPrime(int n) {
        // code here
        if(n<=1) return false;
        int sum=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                sum=sum+i;
                return false;
            }
        }
        return true;
    }
}
