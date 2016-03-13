package com.assignment3;

import com.assignment3.BuildShapes.*;
import com.assignment3.Interface.InterfaceShape;
import com.assignment3.ShapeDomain.ShapeData;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class TestShapes {



    @Test
    public void testCircle() throws Exception {

        ShapeData data = new CircleBuild().getShapeData();

        Assert.assertEquals("Blue",data.getColour());

    }

    @Test
    public void testPentagon() throws Exception {

        ShapeData data = new Pentagon().getShapeData();

        Assert.assertEquals(5,data.getSides());

    }

    @Test
    public void testTriangle() throws Exception {

        ShapeData data = new TriangleBuild().getShapeData();

        Assert.assertNotSame("Circle",data.getName());

    }

    @Test
    public void testSquare() throws Exception {

        ShapeData data = new SquareBuild().getShapeData();

        Assert.assertSame(4,data.getSides());

    }

    @Test
    public void testOctogon() throws Exception {

        ShapeData data = new OctogonBuild().getShapeData();

        Assert.assertEquals("Octogon",data.getName());

    }
}
