/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.api;

import java.awt.Point;
import java.lang.reflect.Field;

public class Fields {

    public static void main(String[] args) {


        try {
            {
                Class<Integer> clazz = Integer.class;
                Field field = clazz.getField("MAX_VALUE");
                int value = field.getInt(null);
                System.out.println(value); // -> 2147483647
            }
            {
                Point point = new Point();
                Class<?> clazz = point.getClass();
                Field fieldX = clazz.getField("x");
                Field fieldY = clazz.getField("y");
                fieldX.setInt(point, 640);
                fieldY.setInt(point, 480);
                System.out.println(point); // -> java.awt.Point[x=640,y=480]
            }

        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
