class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left =0;
        int right = height.length -1;

        if(height.length == 2){
            return Math.min(height[0],height[1]);
        }


        while(left < right ){
            int min_height = Math.min(height[left],height[right]);

            int width = right - left ;

            max_area = Math.max(max_area , min_height*width);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return max_area;
    }
}