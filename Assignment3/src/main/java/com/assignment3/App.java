package com.assignment3;

import com.assignment3.BuildShapes.*;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String value ="";

        System.out.println( "Hello World!" );

         value = JOptionPane.showInputDialog(null,"Menu\n____________\n1. Circle\n2. Octogon \n3. Pentagon \n4. Square \n5.Triangle\n enter a Number:");

        while(!value.equalsIgnoreCase("1")&&!value.equalsIgnoreCase("2")&&!value.equalsIgnoreCase("3")&&!value.equalsIgnoreCase("4")&&!value.equalsIgnoreCase("5"))
        {
            value = JOptionPane.showInputDialog(null,"Menu\n____________\n1. Circle\n2. Octogon \n3. Pentagon \n4. Square \n5.Triangle\n enter a Number:");

        }
        if (value.equalsIgnoreCase("1"))
        {
            CircleBuild circle = new CircleBuild();

            JOptionPane.showMessageDialog(null,"Circle Attributes\n______________\n"+ "Name: "+circle.getShapeData().getName()+"\nSides: "+circle.getShapeData().getSides()+"\nColour: "+circle.getShapeData().getColour());

        }
        if (value.equalsIgnoreCase("2"))
        {
            OctogonBuild octogon = new OctogonBuild();

            JOptionPane.showMessageDialog(null,"Octogon Attributes\n______________\n"+ "Name: "+octogon.getShapeData().getName()+"\nSides: "+octogon.getShapeData().getSides()+"\nColour: "+octogon.getShapeData().getColour());

        }
        if (value.equalsIgnoreCase("3"))
        {
            Pentagon pentagon = new Pentagon();

            JOptionPane.showMessageDialog(null,"Pentagon Attributes\n______________\n"+ "Name: "+pentagon.getShapeData().getName()+"\nSides: "+pentagon.getShapeData().getSides()+"\nColour: "+pentagon.getShapeData().getColour());

        }

        if (value.equalsIgnoreCase("4"))
        {
            SquareBuild square = new SquareBuild();

            JOptionPane.showMessageDialog(null,"Square Attributes\n______________\n"+ "Name: "+square.getShapeData().getName()+"\nSides: "+square.getShapeData().getSides()+"\nColour: "+square.getShapeData().getColour());

        }

        if (value.equalsIgnoreCase("5"))
        {
            TriangleBuild triangle = new TriangleBuild();

            JOptionPane.showMessageDialog(null,"Triangle Attributes\n______________\n"+ "Name: "+triangle.getShapeData().getName()+"\nSides: "+triangle.getShapeData().getSides()+"\nColour: "+triangle.getShapeData().getColour());

        }

        System.exit(0);

    }
}
