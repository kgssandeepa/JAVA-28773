

package com.mycompany.testinheritance;


public class TestInheritance
{

    public static void main(String[] args) 
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
         SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); }


    }











package com.mycompany.testinheritance;


public class SuperB 
{
    int x;
    void setIt(int n){x=n;}
    void increase(){x=x+1;}
    void triple(){x=x*3;};
    int returnIt(){return x;}
    
}










package com.mycompany.testinheritance;


public class SubC extends SuperB
{
    void triple () {x=x+3;} // override existing method
    void quadruple () {x=x*4;} // new method

}



