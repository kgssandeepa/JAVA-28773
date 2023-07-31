
package com.mycompany.animal;


public class apacticalNO4Q3
{
    
}






package com.mycompany.animal;


public class Animal
{

    public static void main(String[] args) 
    {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);

    }
}


package com.mycompany.animal;


public class Dog extends Mammal
{
    
}



package com.mycompany.animal;


public class Mammal extends Animal
{
    
}





package com.mycompany.animal;

public class Reptile extends Animal
{
    
}



