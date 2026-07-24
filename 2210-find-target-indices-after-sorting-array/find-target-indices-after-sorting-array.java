class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int a =0;
        int target_count =0;
        for(int i=0 ; i<nums.length ;i++){
            if(nums[i] == target){
                target_count++;
            } 
            if(nums[i] < target){
                a++;
            }
        }
        
        ArrayList <Integer> result = new ArrayList <Integer>();
        while(target_count >0){
            result.add(a);
            target_count--;
            a++;
        }

        return result;
    }
}