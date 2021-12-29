package javaapplication13;

import java.util.Scanner;


public class labreport2_Q4ld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of element in each array : ");
        int elements = s.nextInt();
        if (elements > 10){
            throw new RuntimeException("Error: exceeded maximum array length.");
        }
        if (elements < 1){
            throw new RuntimeException("Error: invalid array length.");
        }
        // Defining slots of array according to user's input
        int[] a = new int[elements];
        int[] b = new int[elements];

        System.out.println("Enter elements of array a : ");
        for (int i = 0; i < elements; i++) {
            a[i] = Integer.parseInt(s.next());
            // a[i] = s.nextInt(); ?
        }

        System.out.println("Enter elements of array b : ");
        for (int i = 0; i < elements; i++) {
            b[i] = Integer.parseInt(s.next());
            // b[i] = s.nextInt(); ?
        }

        System.out.println(MaxSumOfXOR( a, b,0));
    }

    public static int MaxSumOfXOR(int[] a, int[] b, int elements) {
        int max = 0;
        if (elements >= a.length) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i] ^ b[i];
            }
            return sum;
        }
            for (int i = elements; i < a.length; i++) {
                int temp = b[elements];
                b[elements] = b[i];
                b[i] = temp;

                int carry = MaxSumOfXOR(a, b, elements + 1);

                if (carry > max) {
                    max = carry;
                }

                temp = b[elements];
                b[elements] = b[i];
                b[i] = temp;

            }
            return max;
        }

}
