/*
Enter a Number:
1234
temp= n % 10 = 1234 % 10 = 4
rev = rev *10 + temp = 0*10 + 4 = 4
n = n / 10 = 1234 / 10 = 123
Repeat:
temp = 123 % 10 = 3
rev = 4 * 10 + 3 = 43
n = 123 / 10 = 12
Repeat:
temp = 12 % 10 = 2
rev = 43 * 10 + 2 = 432
n = 12 / 10 = 1
Repeat:
temp = 1 % 10 = 1
rev = 432 * 10 + 1 = 4321
n = 1 / 10 = 0
  */

import java.util.Scanner;
public class Reverse{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n=sc.nextInt();
    int temp;
    int rev=0;
    int num=n;
    while(n!=0){
      temp=n%10;
      rev=rev*10+temp;
      n=n/10;
    }
   System.out.println("Reversed Number:"+rev);
  }
}
