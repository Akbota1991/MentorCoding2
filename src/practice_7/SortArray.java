package practice_7;

import java.util.Arrays;

public class SortArray {


    //Question2: Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    // Ex:
    // int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};


        System.out.println(Arrays.toString(sortingArrayAsc(arr)));


    }



        public static int[] sortingArrayAsc ( int[] arr){

            int temp =0;
            int[] result = Arrays.copyOfRange(arr, 0, arr.length);

            for (int i = 0; i < result.length; i++) {

                for (int j = 0; j < result.length; j++) {
                    if (result[i] < result[j]) {
                       temp= result[i];
                        result[i] = result[j];
                        result[j] = temp;
                    }
                }

            }

            return result;

        }


    }
        






