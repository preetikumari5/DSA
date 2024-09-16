// peak element in 2D array or matrix

class Solution {
public:
    vector<int> findPeakGrid(vector<vector<int>>& mat) {
        int i = 0,j=0;
        vector<int> ans;
        while(i<mat.size() && j<mat[0].size())
        {
            if(i>0 && mat[i-1][j]>mat[i][j])
            {
                i = i-1;
            }
            else if(j>0 && mat[i][j-1]>mat[i][j])
            {
                j=j-1;
            }
            else if(i+1 < mat.size() && mat[i+1][j]>mat[i][j])
            {
                i = i+1;
            }
            else if(j+1 < mat[0].size() && mat[i][j+1]>mat[i][j])
            {
                j = j+1;
            }
            else
            {
                ans.push_back(i);
                ans.push_back(j);
                return ans;
            }
        }
        return {-1,-1};
    }
};