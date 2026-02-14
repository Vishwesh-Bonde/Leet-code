class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        vector<vector<int>> rm = matrix;
        for(int i=0; i<matrix.size() ; i++)
        {
            for(int j=0 ; j<matrix.size() ;j++)
            {
            matrix[j][i] = rm[i][j];
            }
        }

        for (int i = 0; i < matrix.size(); i++) {
            reverse(matrix[i].begin(), matrix[i].end());
        }
        
    }
};