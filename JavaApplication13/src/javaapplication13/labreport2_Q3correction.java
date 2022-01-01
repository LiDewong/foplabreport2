package javaapplication13;

public class labreport2_Q3correction {
    
    public static int divisibleNum(String s, int k) {
        String[] input = s.split("");
        
        int count1 = 0; // number of "?"
        int count2 = 0; // number of divisible number
        
        // count how many '?'
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("?")) {
                count1++;
            }
        }
        
        // get the index of each "?"
        int index1 = s.indexOf("?");
        int index2 = s.indexOf("?", index1+1);
        int index3 = s.indexOf("?", index2+1);
        String s1;
        
        for (int i = index1 == 0? 1 : 0; i < 10; i++) {
            input[index1] = String.valueOf(i);
            if (count1 == 1) {
                s1 = "";
                input[index1] = String.valueOf(i);
                for (int j = 0; j < input.length; j++) {
                    s1 += input[j];
                }
                System.out.print(s1 + " ");
                if (Integer.parseInt(s1) % k == 0)
                    count2++;
            }
            
            else {
                for (int j = 0; j < 10; j++) {
                    input[index2] = String.valueOf(j);
                    if (count1 == 2) {
                        s1 = "";
                        for (int m = 0; m < input.length; m++) {
                            s1 += input[m];
                        }
                        System.out.print(s1 + " ");
                        if (Integer.parseInt(s1) % k == 0)
                            count2++;
                    }
                    
                    else {
                        for (int m = 0; m < 10; m++) {
                            input[index3] = String.valueOf(m);
                            s1 = "";
                            for (int n = 0; n < input.length; n++) {
                                s1 += input[n];
                            }
                            System.out.print(s1 + " ");
                            if (Integer.parseInt(s1) % k == 0)
                                count2++;
                            }
                    }
                }
            }
        }
        System.out.println("");
        return count2;
    }
    
    public static void main(String[] args) {
        String s;
        int k;
        System.out.println(divisibleNum(s = "?141", k = 3));
        System.out.println(divisibleNum(s = "???", k = 11));
        System.out.println(divisibleNum(s = "9?2253??", k = 7));
    }
    
}
