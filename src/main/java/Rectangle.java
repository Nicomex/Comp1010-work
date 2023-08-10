package main.java;

public class Rectangle {
    public double length, breath;
    public Rectangle(){
        length = 0;
        breath = 0;
    }
    public Rectangle(double s){
        length = s;
        breath = s;
    }
    public Rectangle(double len, double bre){
        length = len;
        breath = bre;
    }
    public int area(){
        int a = (int) (length * breath);
        return a;
    }
    public boolean isSquare() {
        return (length == breath);
    }
    public boolean biggerThan(Rectangle other){
        int a1 = this.area();
        int a2 = other.area();
        if (a1 > a2) {
            return true;
        }
        else{
            return false;
        }
    }
}

