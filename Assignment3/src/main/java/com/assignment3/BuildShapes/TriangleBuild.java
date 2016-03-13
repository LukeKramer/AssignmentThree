package com.assignment3.BuildShapes;

import com.assignment3.Interface.InterfaceShape;
import com.assignment3.ShapeDomain.ShapeData;

/**
 * Created by student on 2016/03/12.
 */
public class TriangleBuild implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Triangle",3,"Red");
        return shape;

    }
}
