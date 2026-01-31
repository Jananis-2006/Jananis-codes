import java.util.Scanner;
class reve{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    char op=sc.next().charAt(0);
    int n;
    switch(op){
      case '+':
        n=n1+n2;
        System.out.println(n);
        break;
      case '-':
        n=n1-n2;
        System.out.println(n);
        break;
      case '*':
        n=n1*n2;
        System.out.println(n);
        break;
      case '/':
        n=n1/n2;
        System.out.println(n);
        break;
    default:
        System.out.println("CODE");
        
    }
  }
}

        
