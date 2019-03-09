package com.zml.map;

import java.util.HashMap;
import java.util.Map;

/**
 * hashMap
 */
public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        System.out.println(map.size());


        map.put("name","zml");
        map.put("age","20");



        System.out.println(map);

        System.out.println(map.size());





    }



}
