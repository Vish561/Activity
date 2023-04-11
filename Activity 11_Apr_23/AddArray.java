package arrays;

import java.util.*;

public class AddArray {
	
   public static void main(String[] args){
      int[] arr1 = {8, 22, 7, 2, 1, 6};
      int[] arr2 = {77, 19, 61, 2, 9, };

      int[] arr3 = new int[arr1.length];

      //to check both array length is equal or not 
      if(arr1.length==arr2.length){
         for (int i = 0 ,j=0,k=0; i < arr1.length; i++,j++,k++){
            arr3[k] = arr1[i] + arr2[j];
         }
         System.out.println("Addition of Two Arrays :"+Arrays.toString(arr3));
      } else {
         System.out.println("Length is not Same for both array");
      }
   }
}
