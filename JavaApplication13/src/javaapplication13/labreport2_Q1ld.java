/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class labreport2_Q1ld {
    

    public static double findmedian( int[] array){
        double median;
        int temp;
         for (int i = 0; i < array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) { 
                if (array[i] > array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (array.length % 2 ==1){
            median = array[array.length/2];
        }
        else
            median=(array[array.length/2] +array[array.length/2 -1])/2.0;
        return median;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String integers;
        System.out.print("Enter integers:");
        integers=s.next();
        String[] str =integers.split(",");
        int[] array = new int[str.length];
        for(int i=0;i<str.length;i++){
            array[i] = Integer.parseInt(str[i]);
        }
               
        System.out.println(findmedian(array));
    }
    

}
