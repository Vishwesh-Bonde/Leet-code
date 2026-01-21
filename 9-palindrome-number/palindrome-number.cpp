class Solution {
public:
    bool isPalindrome(int x) {
            int x1 = x;
            long long reverse =0;
            int digit =0;

        if (x1<0){
            return false;
            }

        else if(x1==0){
            return true;
        }

        else{

            while(x1 !=0){
            digit = x1 % 10;
            reverse = reverse*10 +digit;
            x1 = x1/10;}

                if(reverse == x){
                    return true;
                }
                else{
                    return false;
                }
            }
        } 
};