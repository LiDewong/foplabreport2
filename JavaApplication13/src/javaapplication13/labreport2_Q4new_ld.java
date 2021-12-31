/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;


public class labreport2_Q4new_ld {
    
    public static int MaxSumOfXOR(int[] a, int[] b) {
      int max=0, num=0 ;
      int n=a.length,fact=1;
        for(int i=1;i<=n;i++){    
            fact=fact*i;      //calculate factorial
        } 
      int xor ;
      for(int j=0;j<fact;j++){
        int sum=0;
        //calculate XOR
         for(int i=0; i<a.length;i++){
                xor=a[i] ^ b[i];
                sum=sum+xor;
            }
         if(sum>max){
             max=sum;
         }
          b=ChangePosition(b,num);
          num++;
         }
         
        return max;
    }
    public static int[] ChangePosition(int[] b,int num){

            while (num>=(b.length)){
                num= num - (b.length);
            }

        int temp = b[num];
        b[num]=b[num+1];
        b[num+1]=temp;

        return b;
    }
    
    
    
    public static void main(String[] args) {
        int[] a1 ={2,4,5,7,10};
        int[] b1 = {13,14,15,16,17};
        int[] a2={174,521,24,224,831,179,712,97};
        int[] b2={281,33,122,415,611,235,737,81};
        System.out.println(MaxSumOfXOR(a1,b1));
        System.out.println(MaxSumOfXOR(a2,b2));
    }
}
