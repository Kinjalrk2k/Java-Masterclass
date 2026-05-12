import java.lang.Math;

public class Point {
    // write code here
    private int x;
    private int y;
    
    public Point() {
        this(0, 0);
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public double distance() {
        return distance(0, 0);
    }
    
    public double distance(Point p) {
        return distance(p.x, p.y);
    }
    
    public double distance(int x, int y) {
        return Math.sqrt(((this.x-x)*(this.x-x)) + ((this.y-y)*(this.y-y)));
    }
}