package models;

/**
 * Created by PhamTuyen on 7/27/2016.
 */
public class Plane {
    public  int x;
    public  int y;
    public int dx;
    public int dy;
    public void move(int x , int y ){
        x += dx;
        y += dy;
    }
    public Plane(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }
}
