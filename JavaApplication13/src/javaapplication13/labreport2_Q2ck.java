package javaapplication13;

import java.util.Scanner;

public class labreport2_Q2ck {
    
    public static String sumOfPowersOf2(int num) {
        int temp = num;
        String remainder = "";
        for (int i = 0; num != 0; i++) {
            remainder += num % 2;
            num /= 2;
        }
        
        String expression = temp + " = ";
        for (int i = 0; i < remainder.length(); i++) {
            if (remainder.charAt(i) == '1') {
                if (i < remainder.length()-1) {
                    expression += (int)Math.pow(2, i) + " + ";
                }
                else
                    expression += (int)Math.pow(2, i);
            }
        }
        return expression;
    }
    
    public static void main(String[] args) {
        System.out.println(sumOfPowersOf2(20));
        System.out.println(sumOfPowersOf2(2021));
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = s.nextInt();
        System.out.println(sumOfPowersOf2(num));
    }
    
}
