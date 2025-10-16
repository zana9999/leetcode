class Solution {
    public int trap(int[] height) {
        
        
        int[] leftMax = new int [height.length];
        int[] rightMax = new int [height.length];
        int lmax = 0;
        int rmax = 0;

        //fill left most max height
        for(int i = 0; i < height.length; i++){
            if(height[i] > lmax){
                leftMax[i] = height[i];
                lmax = height[i];
            } else{
                leftMax[i] = lmax;
            }
        }

      //fill right most max height
        for(int i = height.length-1; i >= 0; i--){
            if(height[i] > rmax){
                rightMax[i] = height[i];
                rmax = height[i];
            }else{
                rightMax[i] = rmax;
            }
        }

        int[] water = new int [height.length];
        int waterCount = 0;
        //count the water
        for(int i = 0; i < height.length; i++){
            water[i] = Math.min(leftMax[i], rightMax[i]) - height[i];
            waterCount += water[i];

        }
        return waterCount;


    }
}
