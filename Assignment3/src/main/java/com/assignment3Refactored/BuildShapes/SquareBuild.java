package com.assignment3Refactored.BuildShapes;

import com.assignment3Refactored.ShapeDomain.ShapeData;
import com.assignment3Refactored.Interface.InterfaceShape;


/**
 * Created by student on 2016/03/12.
 */
public class SquareBuild implements InterfaceShape{

    public ShapeData getShapeData()
    {
        ShapeData shape = new ShapeData("Square",4,"Yellow");

        return shape;

    }


}
