
package com.mycompany.lab12q1;
import java.util.Scanner;

public class LAB12Q1 {

    public static void main(String[] args)
    {
         
       Scanner sc=new Scanner(System.in);
       
          try
        {
            int n1,n2,devision;
       System.out.print("Enter first number:");
       n1=sc.nextInt();
       System.out.print("Enter second number:");
       n2=sc.nextInt();
            devision=n1/n2;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
          finally
          {
              System.out.println("devision");
          }
                  
        
    }
}
