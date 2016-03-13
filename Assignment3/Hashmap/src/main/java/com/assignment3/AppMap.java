package com.assignment3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/11.
 */
public class AppMap {

    Map<String, Integer> m = new HashMap<String, Integer>();
 public void insertinfo() {

     m.put("Luke", 8);
     m.put("Twaha", 4);
     m.put("Chase", 1);
     m.put("Daisy", 3);
     m.put("Luke", 9);
     m.put("Luke", 2);
 }

    public Map<String, Integer> getM() {

        insertinfo();

        return m;
    }
}
