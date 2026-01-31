import java.util.Scanner;
public class Palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int temp;
    int rev=0;
    int num=n;
    while(n!=0){
      temp=n%10;
      rev=rev*10+temp;
      n=n/10;
    }
    if(num==rev){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }
  }
}
      
