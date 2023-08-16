package mypack;

public class Point {
    private int x,y;

    public Point(){
        System.out.println("This is default constructor.");
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){

        this.x = x;
    }

    public void setY(int y){

        this.y = y;
    }

    public void setXY(int x, int y){

        this.x = x;
        this.y = y;
    }
}
