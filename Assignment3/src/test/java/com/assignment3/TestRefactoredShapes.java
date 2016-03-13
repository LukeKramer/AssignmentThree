package com.assignment3;

import com.assignment3Refactored.Configuration.Config;
import com.assignment3Refactored.Interface.InterfaceShape;
import com.assignment3Refactored.ShapeDomain.ShapeData;
import org.junit.Assert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * Created by student on 2016/03/13.
 */
public class TestRefactoredShapes {

    private InterfaceShape shape;

    @BeforeMethod
    public void testConfig() throws Exception {

        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        shape=(InterfaceShape)ac.getBean("circ");
    }

    @Test
    public void testName() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getName(),"Circle");

    }

    @Test
    public void testSides() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getSides(),0);

    }

    @Test
    public void testColour() throws Exception {

        ShapeData data = shape.getShapeData();

        Assert.assertEquals(data.getColour(),"Blue");

    }



}
