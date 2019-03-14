package com.zml.map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * hashMap
 */
public class HashMapTest {

    public static void main(String[] args) {

        System.out.println("=======================================");
        HashMap<String, String> map = new HashMap<>();

        System.out.println(map.size());


        map.put("name","zml");
        map.put("age","20");



        System.out.println(map);

        System.out.println(map.size());

        System.out.println("=======================================");

        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();



        for (int i = 0;i<= 30;i++) {

            concurrentMap.put("name","zml");
        }


        System.out.println(concurrentMap.size());






    }



}
