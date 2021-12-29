/*Write a Java method that accepts an integer as parameter and returns a 
string as an expression of the sum of powers of 2 in increasing order. (Non-duplicate)
 */
package javaapplication13;
//import java.util.Scanner;
public class labreport2_Q2qr {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        System.out.println(power(20));
        System.out.println(power(2021));
    }
    
    
    public static String power(int x){
        String expression=x+" = ";
        int sum=0,cnt=1;
        boolean[] bits=new boolean[32];
        for(int i=0;i<32;i++){                                                    
            bits[i]=(x&(1<<i))!=0;   
            sum+=(x&(1<<i));
            if(sum==x){
                cnt=i;
                }
            if(bits[i]==true){ 
                if(i==cnt)
                expression+=(x&(1<<i));
            else 
                expression+=(x&(1<<i))+" + ";
            }
        }return expression;
    }
}

 