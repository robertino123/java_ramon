package clase_metode;

public class Punct {
    private int x;
    private int y;
    
    Punct (int x, int y){
    this.x = x;
    this.y = y;
    }
    
    Punct() {
    x = 0;
    y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String toString(){
    return "[" + this.x +" , "+ this.y + "]" ;
    }
    
    public double distance(int x, int y){
    double dist =Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y)) ;
    return dist;
        
    }
    public double distance(Punct p1){
    double dist = Math.sqrt((p1.x-this.x)*(p1.x-this.x)+(p1.y-this.y)*(p1.y-this.y));
        return dist;
    }
    
}
