package com.assignment3Refactored.BuildShapes;


import com.assignment3Refactored.ShapeDomain.ShapeData;
import com.assignment3Refactored.Interface.InterfaceShape;

/**
 * Created by student on 2016/03/12.
 */
public class CircleBuild implements InterfaceShape{

    public ShapeData getShapeData() {
        ShapeData shape = new ShapeData("Circle",0,"Blue");
        return shape;
    }
}
