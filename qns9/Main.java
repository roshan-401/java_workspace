package qns9;

import java.lang.reflect.Array;
import java.util.Arrays;

class BubbleSort{
    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        int n = array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {4,6,3,2,8};
        System.out.println("Before sorting: "+Arrays.toString(intArr) );
        BubbleSort.bubbleSort(intArr);
        System.out.println("After sorting: "+Arrays.toString(intArr));
        String[] strArr = {"apple","banana","mango"};
        System.out.println("Before sorting: "+Arrays.toString(strArr));
        BubbleSort.bubbleSort(strArr);
        System.out.println("After sorting: "+Arrays.toString(strArr));

    }
}
