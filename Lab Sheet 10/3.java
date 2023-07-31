package com.mycompany.lab12q3;
import java.util.Scanner;
import java.io.*;
public class LAB12Q3 
{

    public static void main(String[] args)
    {
        try
        {
       File file=new File("nonexistent.txt");
       Scanner sc=new Scanner(file);
       while(sc.hasNextLine())
       {
           String line=sc.nextLine();
           System.out.println("line");
       }
        
       sc.close();
        }
       catch(FileNotFoundException e)
               {
               System.out.println("Error:File not found");             
               
               }
    }
}
