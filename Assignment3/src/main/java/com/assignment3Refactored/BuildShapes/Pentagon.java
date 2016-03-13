package com.assignment3Refactored.BuildShapes;


import com.assignment3Refactored.ShapeDomain.ShapeData;
import com.assignment3Refactored.Interface.InterfaceShape;

/**
 * Created by student on 2016/03/12.
 */
public class Pentagon implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Pentagon",5,"Yellow");
        return shape;
    }
}
