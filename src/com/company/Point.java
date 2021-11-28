package com.company;

import java.security.KeyStore;
import java.lang.Math;

public class Point {
    private double x;
    private double y;
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "x value is " + this.x + ", y value is " + this.y;
    }
    public boolean OnXAxis()
    {
        if (this.y == 0)
            return true;
        else
            return false;
    }

    public boolean SamePoint(Point anotherpoint)
    {
        if (this.x == anotherpoint.x && this.y == anotherpoint.y)
            return true;
        else
            return false;
    }
    public double Distance(Point anotherpoint)
    {
        double distance=Math.sqrt(Math.pow((this.x-anotherpoint.x),2)+Math.pow((this.y-anotherpoint.y),2));
        return distance;
    }
    public boolean unitcircle()
    {
        if (this.x > 1 || this.x < -1 || this.y < -1 || this.y > 1)
            return false;
        else
            return true;
    }
    public Point midPoint(Point anotherpoint)
    {
        Point mid = new Point((this.x + anotherpoint.x)/2,(this.y + anotherpoint.y)/2);
                return mid;
    }

}


