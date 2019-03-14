package com.zml.alth;

public class SortAlthBase {

    public static void main(String[] args) {




        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};


        merge(num1, 3, num2, 3);


    }



    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] num_all = new int[m+n];

        for (int i = 0; i < m; i++) {
            num_all[i] = nums1[i];

        }
        for (int i = m; i< num_all.length;i++){
            num_all[i] = nums2[i-m];
        }

        System.out.println("排序前--------------------");
        for (int temp: num_all) {

            System.out.println(temp);

        }


        /*--------------*/

        for (int i = 0; i < num_all.length; i++) {

            for (int j = 0; j < num_all.length - i - 1; j++) {

                if(num_all[j] > num_all[j+1]) {


                    int temp = num_all[j];

                    num_all[j]=num_all[j+1];

                    num_all[j+1]=temp;

                }


            }

        }



        /*---------------*/



        System.out.println("排序后--------------------");
        for (int temp: num_all) {

            System.out.println(temp);

        }




    }






}
