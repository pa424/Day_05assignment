package com.brizlabs;
import java.util.*;
public class Harmonic {

    public static void main(String args[])
    {
        double x = Integer.parseInt(args[0]);
        double y= Integer.parseInt(args[1]);

        double distance = Math.pow(x*x,+ y*y);

        System.out.println("Distance From (" + x + " , " + y + " ) to ( 0 , 0 ) = " + distance);
    }

}

