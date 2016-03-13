package com.assignment3.BuildShapes;

import com.assignment3.Interface.InterfaceShape;
import com.assignment3.ShapeDomain.ShapeData;

/**
 * Created by student on 2016/03/12.
 */
public class OctogonBuild implements InterfaceShape {

    public ShapeData getShapeData() {

        ShapeData shape = new ShapeData("Octogon",8,"Purpil");
        return shape;
    }
}
