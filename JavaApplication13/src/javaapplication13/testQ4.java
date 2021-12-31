/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author User
 */
public class testQ4 {
    public static void main(String[] args) {
//        System.out.println(2^13);
//        System.out.println(281^174);
//        int[] a1 ={2,4,5,7,10};
//        int[] b1 = {13,15,14,16,17};
//        int sum=0,xo;
//    
//        for(int i=0; i<a1.length ;i++){
//                xo=a1[i] ^ b1[i];
//                
//                sum=sum+xo;
//    }
//        System.out.println(sum);
//   int number=5,fact=1;
//    for(int i=1;i<=number;i++){    
//      fact=fact*i;    
//  } 
//        System.out.println(fact);
//   
    int a=11^18;
    int b=0;
        int n = 0;
    while (n<5){
        
            if(a>b)
                b=a;
            a=10000;
            n++;
    }
            System.out.println(b);
    }
}
