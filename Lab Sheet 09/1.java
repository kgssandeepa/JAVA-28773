package com.mycompany.lab11code;

public class Lab11Code 
{

    public static void main(String[] args) 
    {
        CylinderContainer C1=new CylinderContainer(2.0,4.0);
        System.out.println("Volume is "+C1.Volume());
    }
}


package com.mycompany.lab11code;

public abstract class Container 
{
   
    public abstract double Volume();
}



package com.mycompany.lab11code;

public class CylinderContainer extends Container
{
 private double height;
 private double radius;
 public CylinderContainer(double h,double r)
 {
 this.height=h;
 this.radius=r;
 }
 
 public double Volume()
 {
     double volume=Math.PI*radius*radius*height;
     return volume;
 
 }
}
