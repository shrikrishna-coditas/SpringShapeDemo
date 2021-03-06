package com.bean;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void display(){
        System.out.println("Point A==>"+"X:"+getPointA().getX()+" Y:"+getPointA().getY());
        System.out.println("Point B==>"+"X:"+getPointB().getX()+" Y:"+getPointB().getY());
        System.out.println("Point C==>"+"X:"+getPointC().getX()+" Y:"+getPointC().getY());
    }
}
