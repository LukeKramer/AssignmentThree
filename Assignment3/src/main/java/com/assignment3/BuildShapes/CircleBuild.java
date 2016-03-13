package com.assignment3.BuildShapes;

import com.assignment3.Interface.InterfaceShape;
import com.assignment3.ShapeDomain.ShapeData;

/**
 * Created by student on 2016/03/12.
 */
public class CircleBuild implements InterfaceShape {

    public ShapeData getShapeData() {
        ShapeData shape = new ShapeData("Circle",0,"Blue");
        return shape;
    }
}
