/*
Enter a number:123
  num%10 => 3
  rem=3
  sum=0=>0+3
  num/10=>12
  rem=2
  sum=3=>2+3=5
  num=1
  rem=1
  sum=6
  */


import java.util.Scanner;
public class AddDigit{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      int num=sc.nextInt(); 
      int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
