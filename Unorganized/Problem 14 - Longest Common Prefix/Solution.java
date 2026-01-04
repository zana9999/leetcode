import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i < strs[0].length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(i > strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                        return str.toString();
                }

            };
            str.append(strs[0].charAt(i));
        }
    

        System.out.println(str.toString());
        return str.toString();
    }

     public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Input: [\"flower\", \"flow\", \"flight\"]");
        System.out.println("Output: " + sol.longestCommonPrefix(strs1));

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Input: [\"dog\", \"racecar\", \"car\"]");
        System.out.println("Output: " + sol.longestCommonPrefix(strs2));

        // Test case 3
        String[] strs3 = {"interview", "internet", "internal"};
        System.out.println("Input: [\"interview\", \"internet\", \"internal\"]");
        System.out.println("Output: " + sol.longestCommonPrefix(strs3));
    }



}

   
   