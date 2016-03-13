package com.assignment3.BuildShapes;

import com.assignment3.Interface.InterfaceShape;
import com.assignment3.ShapeDomain.ShapeData;

/**
 * Created by student on 2016/03/12.
 */
public class Pentagon implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Pentagon",5,"Yellow");
        return shape;
    }
}
