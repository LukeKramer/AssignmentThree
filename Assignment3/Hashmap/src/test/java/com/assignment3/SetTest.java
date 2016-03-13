package com.assignment3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by student on 2016/03/11.
 */
public class SetTest {

    @Test
    public void testSet() throws Exception {

        AppSet set = new AppSet();
        Set s = set.getSet();


        Assert.assertEquals(3,s.size());




    }
}
