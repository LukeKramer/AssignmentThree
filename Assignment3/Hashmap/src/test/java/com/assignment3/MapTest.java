package com.assignment3;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/11.
 */
public class MapTest {

    @Test
    public void testMap() throws Exception {

        //Map m1 = new HashMap();
        AppMap map = new AppMap();
        Map m1 = map.getM();

        Assert.assertFalse((m1.containsValue(9)));

            


    }
}
