
package com.mycompany.assignmentnew2;

public interface Shape 
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    
    
}


package com.mycompany.assignmentnew2;

public class Traingle implements Shape 
{
    private double a,b;
    
    public void seta(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public double geta()
    {
        return a;
    }
     public double getb()
    {
        return b;
    }
     public Traingle(double a,double b)
     {
         this.a=a;
         this.b=b;
     }
     @Override
    public  double calculateArea()
    {
        double area=a*b*0.5;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        double P=3*a;
        return P;
    }
}

package com.mycompany.assignmentnew2;

public class AssignmentNew2 
{

    public static void main(String[] args) 
    {
        Circle C1=new Circle(7);
        C1.setRadius(7);
        System.out.println("Radius:"+C1.getRadius());
        System.out.println("Area:"+C1.calculateArea());
        System.out.println("Perimeter:"+C1.calculatePerimeter());
        
        Rectangle R1=new Rectangle (4,5);
        R1.setValue(4,5 );
        System.out.println("Length:"+R1.getLength());
        System.out.println("Width:"+R1.getWidth());
        System.out.println("Area:"+R1.calculateArea());
        System.out.println("Perimeter:"+R1.calculatePerimeter());
        
        Traingle T1=new Traingle(4,5);
        T1.seta(4, 5);
        System.out.println("a:"+T1.geta());
        System.out.println("b:"+T1.getb());
        System.out.println("Area:"+T1.calculateArea());
        System.out.println("Perimeter:"+T1.calculatePerimeter());
        
       
        
        
    }
}

package com.mycompany.assignmentnew2;

public class Circle implements Shape
{
    private double radius;
    
    public void setRadius(double r)
    {
        this.radius=r;
    }
    public double getRadius()
            
    {
        return radius;
    }
    public Circle(double r)
    {
        this.radius=r;
    }
    @Override
    public  double calculateArea()
    {
        double area=radius*radius*3.1415f;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        double P=2*radius*3.1415f;
        return P;
    }
}

package com.mycompany.assignmentnew2;

public class Rectangle implements Shape
{
    private double length,width;
    
    public void setValue(double l,double w)
    {
        this.length=l;
        this.width=w;
    }
    public double getLength()
            
    {
        return length;
    }
     public double getWidth()
            
    {
        return width;
    }
     public Rectangle(double l,double w)
     {
         this.length=l;
         this.width=w;
     }
     @Override
    public  double calculateArea()
    {
        double area=length*width;
        return area;
    }
    @Override
    public double calculatePerimeter()
    {
        double P=2*(width+length);
        return P;
    }
}
