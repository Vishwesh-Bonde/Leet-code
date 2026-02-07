class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int, int> freq;
        int n = nums.size();

        for (int i= 0; i< n; i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] > n/ 2) {
                return nums[i];
            }
        }
        return -1 ; 
    }
};
