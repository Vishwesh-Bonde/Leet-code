class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<=s.length()-1 ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch) ){
                sb.append(ch);
            }
            else{
                continue;
            }
        }

        String result = sb.toString();
        int i=0;
        int j = result.length()-1;
       
        while(i<=j){
            if(Character.toLowerCase(result.charAt(i)) == Character.toLowerCase(result.charAt(j))){
                i++;
                j--;
                
            }
            else{
                return false;
            }
        }
        return true;
        
        
    }
}