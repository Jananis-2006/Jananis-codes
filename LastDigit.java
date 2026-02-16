/*
Input: a = "3", b = "10"
Output: 9
Explanation: 310 = 59049. Last digit is 9.
*/

class Solution {
    static int getLastDigit(String a, String b) {
        // code here
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        int c=(int) Math.pow(x,y);
        int d=c%10;
        return d;
    
}
}
