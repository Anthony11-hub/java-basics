package com.company;

import java.awt.*;
import java.util.Date;

public class Variables {
    public static void main(String[] args){
        int herAge = 30;
        System.out.println(herAge);
        //Primitive types
        byte age = 30;
        int viewsCount = 312_345_678;
        long viewsCount2 = 33_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        //Reference types
        Date now = new Date();
        /* The Variable now is an instance of the Date() class. Date() class is the
        * blueprint for creating new objects. An object is an instance of a class.
        * This object has members that we can access using the dot operator i.e now.getTime() */
        System.out.println(now);
        Point point1 = new Point(1,1);
        Point point2 = point1;/* Here both point1 and point2 are both referencing
         the memory location of Point but they aren't storing the data*/
        point1.x = 2;
        System.out.println(point2);
    }
}
