class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        if(n == 1){
            if(nums[0] == 1)return 0;
            if(nums[0] == 0)return 1;
        }
        for(int i =0;i<n-1; i++){
            if(nums[0] != 0 ){return 0;}
            if(nums[i]+1 != nums[i+1]){
                return nums[i]+1;
            }
            if(nums[n-1] != n){return n;}
           

        }
        return 1;
        
    }
};