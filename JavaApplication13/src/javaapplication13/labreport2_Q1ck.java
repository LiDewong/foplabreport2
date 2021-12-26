package javaapplication13;

public class labreport2_Q1ck {
    
    public static double median(int[] num) {
        // Bubble sort
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        
        double median;
        
        if (num.length % 2 == 1)
            median = num[num.length/2];
        else
            median = (double)((num[num.length/2 - 1] + num[num.length/2]) / 2);
        
        return median;
    }

    public static void main(String[] args) {
        int[] num1 = {14, 3, 5, 6, 1, 2, 33};
        int[] num2 = {4, 5, 2, 24, 231, 1, 2, 9};
        System.out.println(median(num1));
        System.out.println(median(num2));
    }
    
}
