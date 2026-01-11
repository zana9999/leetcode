/*
 * @lc app=leetcode id=2185 lang=java
 *
 * [2185] Counting Words With a Given Prefix
 */

// @lc code=start
class Solution {
    public int prefixCount(String[] words, String pref) {
        

        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }

        return count;
    }
}
// @lc code=end

