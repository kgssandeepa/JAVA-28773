

package com.mycompany.practicalnq3;


public class PracticalNQ3 
{

    public static void main(String[] args)
    {
       Student S1=new Student(111,"Jeneesha","CS");
        System.out.println("Student Id:"+S1.getID());
        System.out.println("Student name:"+S1.getName());
        System.out.println("Student course:"+S1.getCourse());
        
        System.out.println();
        
        Lecturer L1=new Lecturer(222,"Mr.Shefraz","Java");
        System.out.println("Lecturer Id:"+L1.getID());
        System.out.println("Letcturer name:"+L1.getName());
        System.out.println("Lecturer Programme:"+L1.getProgramme());
       
    }
}






package com.mycompany.practicalnq3;

public class Lecturer extends Person
{
    private String programme;
    
    public Lecturer(int id,String name,String pro)
    {
        super(id,name);
        this.programme=pro;
    }
    public String getProgramme()
    {
        return programme;
    }
}







package com.mycompany.practicalnq3;


public class Person 
{
   private int ID;
   private String name;
   
   public Person(int id,String name)
   {
       this.ID=id;
       this.name=name;
   }
   public int getID()
   {
       return ID;
       
   }
   public String getName()
   {
       return name;
   }
           
}






package com.mycompany.practicalnq3;

public class Student extends Person
{
    private String course;
    
    public Student(int id,String name,String course)
    {
        super(id,name);
        this.course=course;
    }
    public String getCourse()
    {
        return course;
    }
}
