class Solution {
    public int maximumSwap(int num) {
        
        int max = 0;

        while(num != 0){
            int digit = num % 10;
            max = (digit > max) ? digit : max;
            num = num /10;
        }

        return max;

        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] inputs = {
            2736,   // example 1
            9973,   // example 2
            0,      // single digit
            5,      // single digit
            10,     // swap makes smaller
            100,    // leading zero case
            111,    // all digits same
            98368,  // internal swap
            1993,   // first and last
            1234,   // increasing order
            27362,  // swap near front
            99731   // no beneficial swap
        };

        int[] expected = {
            7236,
            9973,
            0,
            5,
            10,
            100,
            111,
            98863,
            9913,
            4231,
            72362,
            99731
        };

        for (int i = 0; i < inputs.length; i++) {
            int result = sol.maximumSwap(inputs[i]);
            System.out.println(
                "Test " + (i + 1) +
                " | Input: " + inputs[i] +
                " | Expected: " + expected[i] +
                " | Got: " + result +
                (result == expected[i] ? " ✅" : " ❌")
            );
        }
    }
}