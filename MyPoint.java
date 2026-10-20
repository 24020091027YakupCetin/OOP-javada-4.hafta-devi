
package mypoint;



public class MyPoint {
    
    private double x;
    private double y;
    
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(MyPoint p){
        
        double A=(p.getX()-this.x);
        double B=(p.getY()-this.y);
        
        return  Math.sqrt((A*A)+(B*B));
    }
    
    public  double distance(double p1,double p2){
        
        double C=(p1-this.x);
        double D=(p2-this.y);
        
        
        
        return  Math.sqrt((C*C)+(D*D)); 
        
    }
    
    public static double distance(MyPoint p1,MyPoint p2){
        
        double E=(p2.getX()-p1.getX());
        double F=(p2.getY()-p1.getY());
        
        
        
        return  Math.sqrt((E*E)+(F*F));
      
    }
    
    
    
    
    

    
    
    
}
