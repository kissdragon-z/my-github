package com.zml.alth;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortAlthList {


    private static List<Integer> list_1 = new LinkedList<Integer>();
    private static List<Integer> list_2 = new LinkedList<Integer>();

    public static void main(String[] args) {


        list_1.add(1);
        list_1.add(2);
        list_1.add(3);


        list_2.add(1);
        list_2.add(4);
        list_2.add(5);




        list_1.addAll(list_2);

        sort(list_1);



    }


    private static void sort(List<Integer> list) {


        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });



        System.out.println(list);

    }



}
