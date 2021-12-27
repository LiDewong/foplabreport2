/*Write a Java method that accepts an integer as parameter and returns a 
string as an expression of the sum of powers of 2 in increasing order. (Non-duplicate)
 */
package lr2q2;
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

    
//for(int i=0;i<32;i++){           (num&(1<<i))  (1<<i)有包括在num里面就是true，就show num
//            bits[i]=(x&(1<<i))!=0;     //1st iteration: bits[0]=2021(1<<0)!=0;    //1<<i = Math.pow(2,i) for i=0, (1<<i)=1 compare to 11111100101(true)
//                                            //for i=1,(1<<i)=10 compare to 11111100101(false)
                                                                                   //for i=6,=1000000  compare to 11111100101(false)