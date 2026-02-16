/*
Input: n = 6
Output: true 
Explanation: Factors of 6 are 1, 2, 3 and 6. Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.
  */


class Perfect {
    static boolean isPerfect(int n) {
        // code here
        if(n<=0) return false;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum==n;
    }
}
