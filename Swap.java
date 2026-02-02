/*
Enter the first number:
5
Enter the Second number:
8
Numbers Before Swapping:5 8
Numbers After Swapping:8 5
  */


/*First Method*/
import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int n1=sc.nextInt();
      System.out.println("Enter the Second number:");
      int n2=sc.nextInt();
      System.out.println("Numbers Before Swapping:"+n1+" "+n2);
      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
      System.out.println("Numbers After Swapping:"+n1+" "+n2);

    }
}
/*second method*/
import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int n1=sc.nextInt();
      System.out.println("Enter the Second number:");
      int n2=sc.nextInt();
      System.out.println("Numbers Before Swapping:"+n1+" "+n2);
      n1=n1*n2;
      n2=n1/n2;
      n1=n1/n2;
      System.out.println("Numbers After Swapping:"+n1+" "+n2);

    }
}

/*Third method*/
import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int n1=sc.nextInt();
      System.out.println("Enter the Second number:");
      int n2=sc.nextInt();
      System.out.println("Numbers Before Swapping:"+n1+" "+n2);
      int temp=0;
      temp=n1;
      n1=n2;
      n2=temp;
      System.out.println("Numbers After Swapping:"+n1+" "+n2);

    }
}
