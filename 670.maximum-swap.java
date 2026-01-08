/*
 * @lc app=leetcode id=670 lang=java
 *
 * [670] Maximum Swap
 */

// @lc code=start
class Solution {
    public int maximumSwap(int num) {
        
        char[] ch = String.valueOf(num).toCharArray();
        int min = ch[0] - '0'; 
        int max = ch[0]-'0';
        

        while(num != 0){
            int digit = num % 10;
            max = (digit > max) ? digit : max;
            num = num /10;
        }

        int maxIndex = 0;

        for(int i = 0; i < ch.length; i++){
            if(ch[i]-'0' == max){
                maxIndex = i;
            }
        }

        char temp = ch[maxIndex];
        ch[maxIndex] = ch[0];
        ch[0] = temp;

        int newNum = Integer.parseInt(new String(ch));

        return newNum;




    }
}
// @lc code=end

