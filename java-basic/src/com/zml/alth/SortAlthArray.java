package com.zml.alth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAlthArray {


    private static int[] num_1 = new int[]{1,2,3,0,0,0};
    private static int[] num_2 = new int[]{2,5,6};



    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < m; i++) {


            list.add(nums1[i]);

        }

        for (int temp  :  nums2) {

            list.add(temp);

        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                return a1 - a2;
            }
        });



        System.out.println("------over-------");

        System.out.println(list);


    }




    public static void main(String[] args) {

        merge(num_1,3, num_2, 3);

    }


}
