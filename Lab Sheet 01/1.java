package com.mycompany.p02part1;
public class Item
{
    protected int location;
    protected String description;
    
    public Item(int location,String desc)
    {
        this.location=location;
        this.description=desc;
    }
    public void setLocation(int loc)
    {
        location=loc;
    }
    public void setDescription(String desc)
    {
        description=desc;
    }
    public int getLocation()
    {
        return location;
    }
    public String getDescription()
    {
        return description;
    }
   
   
}





package com.mycompany.p02part1;

public class Monster extends Item 
{
    public Monster(int location,String desc)
    {
       this.location=location;
       this.description=desc;
    }
    
}





package com.mycompany.p02part1;
public class P02Part1 
{

    public static void main(String[] args) 
    {
        Item I1=new Item(111,"Item name");
        I1.setDescription("description");
        System.out.println("description:"+I1.description);
        
        Monster m1=new Monster(222,"Item");
        m1.setLocation(2565);
        System.out.println("Location:"+m1.getLocation());
    }
}







