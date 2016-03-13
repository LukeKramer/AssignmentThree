package com.assignment3;

import com.sun.org.apache.xpath.internal.SourceTree;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

/**
 * Created by student on 2016/03/11.
 */
public class ListTest {

    @Test
    public void testList() throws Exception {

        AppList list = new AppList();
        int freq = Collections.frequency(list.getList(),"TPG200");
        Assert.assertEquals(2,freq);

    }
}
