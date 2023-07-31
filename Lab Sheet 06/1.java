package com.mycompany.p05q01;

public class P05Q01 
{

    public static void main(String[] args)
    {
        classs obj1=new classs();
        obj1.display();
    }
}


package com.mycompany.p05q01;

public abstract class Abstract
{
    public abstract void display();
    public void Display()
    {
        int x=5;
        System.out.println("X:"+x);
    }
    
}


package com.mycompany.p05q01;


public class classs extends Abstract
{
    public void display()
    {
        int x=10;
        System.out.println("X:"+x);
    }
    
}

