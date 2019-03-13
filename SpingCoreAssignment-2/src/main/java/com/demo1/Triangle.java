package com.demo1;

public class Triangle {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

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

    public void myInit()
    { //Init method
        System.out.println("init method called for Triangle");
    }
    public void myDestroy()
    { //destroy method
        System.out.println("destroy method called for Triangle");
    }
    public void show()
    {
        System.out.println("triangle class");
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
