package Calc2;

public class Main {
    
    public static void main(String[] args)
    {
        Calc2 c1 = new Calc2();
        Calc2 c2 = new Calc2();
        
        c1.setName  ("Awesomenes");
        c2.setName  ("Bacon egg & cheese");
        
        System.out.println(c1.getName() + " calculated " + c1.add(3,4));
        System.out.println(c2.getName() + " calculated " + c2.modlus(29,45));
    }    
}
    
 