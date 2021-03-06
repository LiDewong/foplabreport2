/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;


public class labreport2_Q4this {
    
    public static int MaxSumXOR(int[] a, int[] b, int index){
        int n = a.length;
        int max = 0;
        int[] indexArray = new int[n];

        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;

        for (int num = 0; num < factorial; num++) {
            
            for (int nb = num, i = 1; i <= n; nb /= i, i++)
                indexArray[n - i] = nb % i;

            for (int i = n-1; i >= 0; i--)
                for (int j = i+1; j < n; j++)
                    if (indexArray[j] >= indexArray[i]) {
                        indexArray[j]++;
                    }
       int sum = 0;
            for (int i = 0; i < n; i++)
                sum += a[i] ^ b[indexArray[i]];
            if (sum > max) 
                max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a1 = {2,4,5,7,10};
        int[] b1 = {13,14,15,16,17};

        System.out.print("The maximum sum of XOR: ");

        System.out.println(MaxSumXOR(a1, b1,0));
        
        int[] a2 = {174, 521, 24, 224, 831, 179, 712, 97};
        int[] b2 = {281, 33, 122, 415, 611, 235, 737, 81};

        System.out.print("The maximum sum of XOR: ");

        System.out.println(MaxSumXOR(a2, b2,0));
}
}
