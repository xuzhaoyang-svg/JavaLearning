package javacode.src;

public class Point {
    double x,y,d2;
    public Point(int x,int y){
        this.x=x;
        this.y=y;

    }
    public double distant(Point p2){
        d2=(x- p2.x)*(x- p2.x)+(y- p2.y)*(y- p2.y);
        return Math.sqrt(d2);
    }


}
