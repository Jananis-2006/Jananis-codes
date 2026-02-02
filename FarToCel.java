/*
Enter the temperature in Farenheit:
98.4
Temperature in Celcius:33.2
  */

import java.util.Scanner;
public class FarToCel{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the temperature in Farenheit:");
      double temp=sc.nextDouble();
      double cel=((temp-32)*5/10);
      System.out.println("Temperature in Celcius:"+cel);
    }
}
