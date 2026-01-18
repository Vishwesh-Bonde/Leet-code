class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        nums1.insert(nums1.end(),nums2.begin(),nums2.end());
        sort(nums1.begin(),nums1.end());

        if(nums1.size() % 2 != 0){
            return (nums1[(nums1.size()/2)]);

        }

        else{
            int a = nums1.size()/2;
            float b = (nums1[a]+nums1[a-1])/2.0;
            return b;

        }
           return 0;  
    }
};