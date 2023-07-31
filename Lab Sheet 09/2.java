package com.mycompany.lab11q02;

public class Lab11Q02 
{

    public static void main(String[] args) 
    {
        NewPlayer p1=new NewPlayer(1);
        p1.MoveUp();
        p1.MoveDown();
        p1.MoveLeft();
        p1.MoveLeft();
        System.out.println("");
        NewPlayer P2=new NewPlayer(1);
        P2.MoveDown();
        P2.MoveUp();
        P2.MoveLeft();
        P2.MoveRight();
        System.out.println("");
        NewPlayer3 p3=new NewPlayer3(1);
        p3.CrouchedJump();
        p3.Jump();
        p3.MoveDown();
        p3.MoveLeft();
        p3.MoveRight();
        p3.MoveUp();
        
    }
}

package com.mycompany.lab11q02;

public abstract class  Movements 
{
    protected int sp;
   public abstract void MoveUp(); 
   public abstract void MoveDown(); 
   public abstract void MoveLeft(); 
   public abstract void MoveRight();
 

}


package com.mycompany.lab11q02;


public class NewPlayer extends Movements 
{
    
    public  NewPlayer(int i)
    {
        this.sp=i;
    }
    @Override
    public void MoveUp()
    {
        System.out.println("Moved up");
    }
    @Override
     public void MoveDown()
    {
         System.out.println("Moved down");
    }
    @Override
      public void MoveLeft()
    {
        System.out.println("Moved left"); 
    }
    @Override
       public void MoveRight()
    {
        System.out.println("Moved right");
    }



}



package com.mycompany.lab11q02;

public class NewPlayer2 extends Movements
{
    public  NewPlayer2(int i)
    {
        this.sp=i;
    }
    public void MoveUp()
    {
        System.out.println("Moved down");
    }
     public void MoveDown()
    {
         System.out.println("Moved up");
    }

    {
        System.out.println("Moved right"); 
    }
       public void MoveRight()
    {
        System.out.println("Moved left");
    }
}




package com.mycompany.lab11q02;
public class NewPlayer3 extends Movements
{
    
    public  NewPlayer3(int i)
    {
        this.sp=i;
    }
      public void Jump()
   {
       System.out.println("Jumped 5 spaces");
   }
    public void CrouchedJump()
   {
       System.out.println("Jumped 2 spaces");
   }
    @Override
    public void MoveUp()
    {
        System.out.println("Moved up");
    }
    @Override
     public void MoveDown()
    {
         System.out.println("Moved down");
    }
    @Override
      public void MoveLeft()
    {
        System.out.println("Moved left"); 
    }
    @Override
       public void MoveRight()
    {
        System.out.println("Moved right");
    }
    
    
}



