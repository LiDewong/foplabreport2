/*
Write a Java method which accepts two same length arrays, a and b, as 
parameters and returns the maximum sum of XOR values of the two arrays 
with each of the elements matched. A match means one element of array a is 
uniquely matched with one element of array b. The lengths of the arrays are
at most 10.

The maximum sum of XOR values of two arrays, a and b, in the first input is 87, 
with the match of (2,13), (4,15), (5,14), (7,16), (10,17).

Got this from my roommate
 */
package javaapplication13;

import java.util.Scanner;


public class labreport2_Q4ck {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        int arrSize = 1000;
        while(arrSize>10 || arrSize< 0){
        System.out.print("enter array size(must not be bigger than 10): ");
        arrSize = sn.nextInt();
        
        if(arrSize > 10){
            System.out.println("error enter a new array size");}
        }
        int[] x = new int[arrSize];
        int[] y = new int[arrSize];
        
        System.out.println("enter the elements of array 1:-");
        for(int i = 0;i< arrSize;i++){
            x[i]=sn.nextInt();
            
        }
          
        System.out.println("enter the elements of array 2:-");
        for(int i = 0;i< arrSize;i++){
            y[i]=sn.nextInt();
            
        }
       
 
        
        System.out.println("ans :"+xor(x,y));
        
        
    }
    public static int xor(int[] x,int[] y){
        int maxSum = 0;
        int ans = 0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0;
        int length = x.length;
        int[][]xorMatrix = new int[x.length][x.length];
        for( i = 0 ; i<x.length ; i++){//creating the 2d array
                    for( j = 0 ; j<x.length ; j++){
                        xorMatrix[i][j] = x[i]^y[j];
                    }
                 }
        
         System.out.println("");
         
         
         switch(length){
             case 1 :
                 maxSum = xorMatrix[0][0];
                 break;
              //    System.out.println("pair selected is: "+x[0]+","+y[0]);
            
             case 2 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;i<x.length;i++){
                         if(j == i){
                             continue;
                         }
                         ans = xorMatrix[0][i]+xorMatrix[1][j];
                          
                         if(ans>maxSum)
                             maxSum=ans;
                         
                     }
                 }
            //     System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]);
             break;
             case 3 :
                   for( i = 0;i<x.length;i++){
                         for( j = 0;j<x.length;j++){
                             if(j == i)
                             continue;
                               for( k = 0;k<x.length;k++){
                             if(k == j)
                             continue;
                             
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k];
                               
                           if(ans>maxSum)
                             maxSum=ans;
                               }
                         }
                   }
                   // System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]);
             break;
             case 4 :
                  for( i = 0;i<x.length;i++){
                       for( j = 0;j<x.length;j++){
                             if(j == i){
                             continue;}
                            for( k = 0;k<x.length;k++){
                                if(k == j){
                             continue;}
                                 for( l = 0;l<x.length;l++){
                                       if(l == k)
                                        continue;
                                       
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l];
                          
                           if(ans>maxSum)
                             maxSum=ans;
                                 }
                            }
                       }
                  }
                   // System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]);
                   break;
             case 5 :
                  for( i = 0;i<x.length;i++){
                       for( j = 0;j<x.length;j++){
                            if(j == i){
                            continue;}
                            for( k = 0;k<x.length;k++){
                             if(k == j || k==i){
                             continue;}
                                 for( l = 0;l<x.length;l++){
                             if(l == k||l == j||l == i){
                             continue;}
                                      for( m = 0;m<x.length;m++){
                             if(m == l||m == k||m == j||m == i){
                             continue;}
                             
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m];
                        
                           if(ans>maxSum)
                             maxSum=ans;
                                      }
                                 }
                            }
                       }
                  }
                   //  System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]);
                   break;
             case 6 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;j<x.length;j++){
                         if(j == i)
                            continue;
                         for( k = 0;k<x.length;k++){
                         if(k == j || j ==i )
                             continue;
                             for( l = 0;l<x.length;l++){
                         if(l == k || l == j || l == i)
                             continue;
                                 for( m = 0;m<x.length;m++){
                         if(m == l||m == k || m == j || m == i)
                             continue;
                                     for( n = 0;n<x.length;n++){
                         if(n == m||n == l||n == k || n == j || n == i)
                             continue;
                         
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m]+xorMatrix[5][n];
                           
                           if(ans>maxSum)
                             maxSum=ans;
                                     }
                                 }
                             }
                         }
                     }
                 }
                  // System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]+x[5]+","+y[n]);
                  break;
              case 7 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;j<x.length;j++){
                         if(j == i)
                            continue;
                         for( k = 0;k<x.length;k++){
                         if(k == j || j ==i )
                             continue;
                             for( l = 0;l<x.length;l++){
                         if(l == k || l == j || l == i)
                             continue;
                                 for( m = 0;m<x.length;m++){
                         if(m == l||m == k || m == j || m == i)
                             continue;
                                     for( n = 0;n<x.length;n++){
                         if(n == m||n == l||n == k || n == j || n == i)
                             continue;
                                        for( o = 0;o<x.length;o++){
                         if(o == n||o == m||o == l||o == k || o == j || o == i)
                             continue;
                         
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m]+xorMatrix[5][n]+xorMatrix[6][o];
                                      
                           if(ans>maxSum)
                             maxSum=ans;
                                        }
                                     }
                                 }
                             }
                         }
                     }
                 }
                  //   System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]+x[5]+","+y[n]+x[6]+","+y[o]);
             break;
              case 8 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;j<x.length;j++){
                         if(j == i)
                            continue;
                         for( k = 0;k<x.length;k++){
                         if(k == j || k ==i )
                             continue;
                             for( l = 0;l<x.length;l++){
                         if(l == k || l == j || l == i)
                             continue;
                                 for( m = 0;m<x.length;m++){
                         if(m == l||m == k || m == j || m == i)
                             continue;
                                     for( n = 0;n<x.length;n++){
                         if(n == m||n == l||n == k || n == j || n == i)
                             continue;
                                        for( o = 0;o<x.length;o++){
                         if(o == n||o == m||o == l||o == k || o == j || o == i)
                             continue;
                                            for( p = 0;p<x.length;p++){
                         if(p == o||p == n||p == m||p == l||p == k || p == j || p == i)
                             continue;
                           ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m]+xorMatrix[5][n]+xorMatrix[6][o]+xorMatrix[7][p];
                           
                           if(ans>maxSum)
                             maxSum=ans;
                                           }
                                        }
                                     }
                                 }
                             }
                         }
                     }
                 }
               //  System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]+x[5]+","+y[n]+x[6]+","+y[o]+x[7]+","+y[p]);
               break;
                case 9 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;j<x.length;j++){
                         if(j == i)
                            continue;
                         for( k = 0;k<x.length;k++){
                         if(k == j || k ==i )
                             continue;
                             for( l = 0;l<x.length;l++){
                         if(l == k || l == j || l == i)
                             continue;
                                 for( m = 0;m<x.length;m++){
                         if(m == l||m == k || m == j || m == i)
                             continue;
                                     for( n = 0;n<x.length;n++){
                         if(n == m||n == l||n == k || n == j || n == i)
                             continue;
                                        for( o = 0;o<x.length;o++){
                         if(o == n||o == m||o == l||o == k || o == j || o == i)
                             continue;
                                            for( p = 0;p<x.length;p++){
                                                
                         if(p == o||p == n||p == m||p == l||p == k || p == j || p == i)
                             continue;
                                                for( q = 0;q<x.length;q++){
                         if(q == p||q == o||q == n||q == m||q == l||q == k || q == j || q == i)
                             continue;
                            ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m]+xorMatrix[5][n]+xorMatrix[6][o]+xorMatrix[7][p]+xorMatrix[8][q];
                          
                           if(ans>maxSum)
                             maxSum=ans;
                                              }
                                           }
                                        }
                                     }
                                 }
                             }
                         }
                     }
                 }
            //System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]+x[5]+","+y[n]+x[6]+","+y[o]+x[7]+","+y[p]+x[8]+","+y[q]);

            break;
                case 10 :
                 for( i = 0;i<x.length;i++){
                     for( j = 0;j<x.length;j++){
                         if(j == i)
                            continue;
                         for( k = 0;k<x.length;k++){
                         if(k == j || k ==i )
                             continue;
                             for( l = 0;l<x.length;l++){
                         if(l == k || l == j || l == i)
                             continue;
                                 for( m = 0;m<x.length;m++){
                         if(m == l||m == k || m == j || m == i)
                             continue;
                                     for( n = 0;n<x.length;n++){
                         if(n == m||n == l||n == k || n == j || n == i)
                             continue;
                                        for( o = 0;o<x.length;o++){
                         if(o == n||o == m||o == l||o == k || o == j || o == i)
                             continue;
                                            for( p = 0;p<x.length;p++){
                                                
                         if(p == o||p == n||p == m||p == l||p == k || p == j || p == i)
                             continue;
                                                for( q = 0;q<x.length;q++){
                         if(q == p||q == o||q == n||q == m||q == l||q == k || q == j || q == i)
                             continue; 
                                                     for( r = 0;r<x.length;r++){
                         if(r == q ||r == p||r == o||r == n||r == m||r == l||r == k || r == j || r == i)
                             continue; 
                              ans = xorMatrix[0][i]+xorMatrix[1][j]+xorMatrix[2][k]+xorMatrix[3][l]+xorMatrix[4][m]+xorMatrix[5][n]+xorMatrix[6][o]+xorMatrix[7][p]+xorMatrix[8][q]+xorMatrix[9][r];
                             
                           if(ans>maxSum)
                             maxSum=ans;
                                                 }
                                              }
                                           }
                                        }
                                     }
                                 }
                             }
                         }
                     }
                 }
                  //System.out.println("pair selected is: "+x[0]+","+y[i]+x[1]+","+y[j]+x[2]+","+y[k]+x[3]+","+y[l]+x[4]+","+y[m]+x[5]+","+y[n]+x[6]+","+y[o]+x[7]+","+y[p]+x[8]+","+y[q]+x[9]+","+y[r]);
                  break;
                 
                  default :
                 System.out.println("error");
                 break;
         
         }
      return maxSum;
    }
}

