/*Write a Java method that accepts an integer array as parameter and returns the median of the array in double.
 */
package javaapplication13;
import java.util.Scanner;
public class labreport2_Q1qr {
    public static void main(String[] args) {    //main method
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integers:");
        String input=sc.nextLine();
        String[] str =input.split(",");                   //separate integer by ,
        int[] integers = new int[str.length];
        for(int i=0;i<str.length;i++){
            integers[i] = Integer.parseInt(str[i]);       //convert String to Integer
        }
        System.out.println(median(integers));    
    }
    
    public static double median(int[] x){
        
       //Number in ascending order
        for(int j=0; j<x.length-1; j++){    
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    int temp=x[i];
                    x[i]=x[i+1];
                    x[i+1]=temp;
                }
            }
        }
        double median;
        
        if (x.length%2==0)
            median=((double)x[x.length/2] + (double)x[x.length/2-1])/2;
        else
            median=(double) x[x.length/2];
        return median;
    }
    
}
