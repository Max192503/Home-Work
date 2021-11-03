package by.overone.lesson6;

import java.util.Random;

public class ывапр {
    public static void main(String[] args) {
     int[] array ={23,65,7,98,87,43,2,78};
     for (int i=0;i<array.length;i++){
          for (int j=i+1; j<array.length; j++){
              if (array[i]<array[j]){
                  int r = array[j];
                  array[j]=array[i];
                  array[i]=r;
              }
          }
     }
     for (int i=0; i< array.length;i++){
         System.out.println(array[i]+" ");
     }
    }
}
