package com.assignment3;

import javax.swing.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String value = "";
        String value2 = "";

        AppSet studentNumber = new AppSet();
        Set number = studentNumber.getSet();

        value = JOptionPane.showInputDialog(null,"Enter Lecturer pin(example 101)");

       if( number.contains(value) == true)
       {


           AppMap map = new AppMap();
           Map studentName = map.getM();

           value2 = JOptionPane.showInputDialog(null,"Student name & Registered Subjects\n"+studentName.toString());

           if (studentName.containsKey(value2) == true)
           {
               AppList list = new AppList();
               List subjects = list.getList();

               int num = Integer.parseInt(studentName.get(value2).toString());

               if(num == 4)
               {

                   JOptionPane.showMessageDialog(null,"Subjects\n________________\n"+subjects.get(0)+"\n"+subjects.get(1)+"\n"+subjects.get(2)+"\n"+subjects.get(3));


               }
               if(num == 1)
               {

                   JOptionPane.showMessageDialog(null,"Subjects\n________________\n"+subjects.get(0));


               }
               if(num == 3)
               {

                   JOptionPane.showMessageDialog(null,"Subjects\n________________\n"+subjects.get(2)+"\n"+subjects.get(1)+"\n"+subjects.get(4));


               }
               if(num == 2)
               {

                   JOptionPane.showMessageDialog(null,"Subjects\n________________\n"+subjects.get(5)+"\n"+subjects.get(6));


               }




           }


       }








    }
}
