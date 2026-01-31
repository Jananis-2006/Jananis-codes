/*
Enter a number:153
Explanation: 153=>(1*1*1)+(5*5*5)+(3*3*3)
                =>1+125+27
                =>153
*/

import java.util.Scanner;
public class Armstrong{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int t;
    int sum=0;
    int num=n;
    while(n!=0){
      t=n%10;
      sum=sum+(t*t*t);
      n=n/10;
    }
    if(num==sum){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not an Armstrong number");
    }
  }
}
