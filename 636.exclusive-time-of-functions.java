/*
 * @lc app=leetcode id=636 lang=java
 *
 * [636] Exclusive Time of Functions
 */


import java.util.List;
import java.util.Stack;

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {

        int [] result = new int [n];
        int prevTime = 0;
        Stack<Integer> stack = new Stack<>();
        int totalTime = 0;
        int currentFid = -1;

        for(String log : logs){
            String [] parts = log.split(":");
            int fid = Integer.parseInt(parts[0]);
            String type = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timestamp - prevTime;
                }
                stack.push(fid);
                prevTime = timestamp;
            } else { 
                result[stack.pop()] += timestamp - prevTime + 1;
                prevTime = timestamp + 1; 
            }
        }

        return result;
    }
}