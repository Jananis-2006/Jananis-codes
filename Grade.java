/*
Enter the 5 Subject marks:
45
100
98
95
78
Average is:83
A+ grade
  */

import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 5 Subject marks:");
      int s1=sc.nextInt(); 
      int s2=sc.nextInt();
      int s3=sc.nextInt(); 
      int s4=sc.nextInt();
      int s5=sc.nextInt(); 
      int avg=(s1+s2+s3+s4+s5)/5;
      System.out.println("Average is:"+avg);
      if(avg>=90){
        System.out.println("O grade");
      }
      else if(90>avg && avg>=80){
        System.out.println("A+ grade");
      }
      else if(80>avg && avg>=70){
        System.out.println("A grade");
      }
      else if(70>avg && avg>=60){
        System.out.println("B+ grade");
      }
      else if(60>avg && avg>=50){
        System.out.println("B grade");
      }
      else {
        System.out.println("Fail");
        System.out.println("Need Improvement");
      }
    }
}

      
