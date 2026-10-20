
package time;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
        
       long milisaniye=System.currentTimeMillis();
        
        long toplamSaniye = milisaniye/1000;
        this.second=(int) (toplamSaniye%60);
        
        long toplamDakika=toplamSaniye/60;
        this.minute=(int) (toplamDakika%60);
        
        long toplamSaat=toplamDakika/60;
        this.hour=(int) (toplamSaat%24);
        
    }
    
    public Time(long milisaniye){
        long toplamSaniye = milisaniye/1000;
        this.second=(int) (toplamSaniye%60);
        
        long toplamDakika=toplamSaniye/60;
        this.minute=(int) (toplamDakika%60);
        
        long toplamSaat=toplamDakika/60;
        this.hour=(int) (toplamSaat%24);
    }
    
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=second;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
     public String setTime(long elapseTime){
        long toplamSaniye = elapseTime/1000;
        this.second=(int) (toplamSaniye%60);
        
        long toplamDakika=toplamSaniye/60;
        this.minute=(int) (toplamDakika%60);
        
        long toplamSaat=toplamDakika/60;
        this.hour=(int) (toplamSaat%24);
        
        return this.hour+":"+this.minute+":"+this.second;
        
    }

   
    
         
        
  }
    

    
   
    

