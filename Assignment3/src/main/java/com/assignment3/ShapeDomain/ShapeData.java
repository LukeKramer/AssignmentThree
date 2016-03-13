package com.assignment3.ShapeDomain;

import java.io.Serializable;
/**
 * Created by student on 2016/03/12.
 */
public class ShapeData implements Serializable{

    private String name;
    private int sides;
    private String colour;

    public ShapeData(String name,int sides,String colour)
    {
        this.name = name;
        this.sides = sides;
        this.colour = colour;

    }

    public String getColour()
    {
        return colour;
    }

    public String getName()
    {
        return name;
    }

    public int getSides()
    {
        return sides;
    }



}
