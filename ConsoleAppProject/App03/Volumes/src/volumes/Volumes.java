package volumes; spunk
        
       

import java.util.*;
public class Volumes {
    
    double vc=1,vs=1,vcd=1;
    
    void volume(int s)
    {
        
        vs=s*s*s;
        
        
       System.out.println("The cubes volume is"+vc);
                
                
                
    }
    
    
    void volume(float r)
            
    {
     vs=(4/3)*(22/7)*r*r*r;
     
     System.out.println("The voloume of the sphere is "+vs);
     
     
    }
     void volume(int l,int b,int h)
    {
    
     vcd=l*b*h;
     
      System.out.println("The voloume of the cuboid is "+vcd);
            
    }
    
    
    
      public static void main(String[] args) {
      // TODO Auto-generated method sub
  
        int s,l,b,h;
        
        float r;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the side of the cube");
        s=sc.nextInt();
        
         System.out.println("Enter the radius of the sphere");
         r=sc.nextFloat();
         
          System.out.println("Enter the l,b,h of the cuboid");
        
          l=sc.nextInt();
          b=sc.nextInt();
          h=sc.nextInt();
          Volumes obj=new Volumes();
          
          obj.volume(s);
          obj.volume(r);
          obj.volume(l,b,h);
      
      }  
    


 }


