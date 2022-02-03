package Calc2;

public class Calc2
{
    
  private String Name;

   
   
    public int add(int x, int y) {
       return x + y;
   }  
   
  
   
    public int subtract(int x, int y) {
       return x - y;
    }  

    public int multiply(int x, int y) {
       return x * y;
     }  
  
        
       public int divide(int x, int y) {
       return x / y;
    }  
   
       public int modlus(int x, int y) {
       return x % y;  
    }
       
       public void setName(String name)
       {
           this.Name = name;
       }
       
       public String getName()
       {
         return Name;
       }
  }

     


