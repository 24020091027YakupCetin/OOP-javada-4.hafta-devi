
package timetest;


import time.Time;


public class test {
     public static void main(String[] args) {
         
         Time t1=new Time();
         System.out.println(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
                
         
         Time t2=new Time(555550000);
          System.out.println(t2.getHour()+":"+t2.getMinute()+":"+t2.getSecond());
         
         
         Time t3=new Time(5,23,55);
          System.out.println(t3.getHour()+":"+t3.getMinute()+":"+t3.getSecond());
          
          
         Time t4=new Time();
         System.out.println(t4.setTime(555550000));
         
       
          
        
       
        
       
    }

   
    
}
