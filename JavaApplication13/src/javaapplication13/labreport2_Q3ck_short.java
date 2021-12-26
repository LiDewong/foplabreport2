package javaapplication13;

public class labreport2_Q3ck_short {
    
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
        String s1, s2, s3;
        
        for (int i = index1 == 0? 1 : 0; i < 10; i++) {
            s1 = "";
            input[index1] = String.valueOf(i);
            s1 += input[index1];

            if (count1 == 1) {
                if (Integer.parseInt(s1) % k == 0)
                    count2++;
            }
            
            else {
                for (int j = 0; j < 10; j++) {
                    input[index2] = String.valueOf(j);
                    s2 = s1 + input[index2];

                    if (count1 == 2) {
                        if (Integer.parseInt(s2) % k == 0)
                            count2++;
                    }
                    
                    else {
                        for (int m = 0; m < 10; m++) {
                            input[index3] = String.valueOf(m);
                            s3 = s2 + input[index3];
                            if (Integer.parseInt(s3) % k == 0)
                                count2++;
                        }
                    }
                }
            }
        }
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
