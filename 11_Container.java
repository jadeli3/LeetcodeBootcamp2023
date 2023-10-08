class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int length =  height.length - 1;
        int result = Math.min(height[left], height[right]) * length;
        while(left < right){
            if(height[left] < height[right]){
                left++;
                length--;
                int temp = Math.min(height[left], height[right]) * length;
                result = Math.max(result, temp);
            }else{
                right--;
                length--;
                int temp = Math.min(height[left], height[right]) * length;
                result = Math.max(result, temp);
            }
        }
        return result;
    }
}