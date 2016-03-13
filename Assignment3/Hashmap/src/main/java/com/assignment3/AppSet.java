package com.assignment3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/11.
 */
public class AppSet {

    Set<String> set = new HashSet<String>();


    public Set<String> getSet() {

        set.add("101");
        set.add("102");
        set.add("103");
        set.add("101");


        return set;
    }
}
