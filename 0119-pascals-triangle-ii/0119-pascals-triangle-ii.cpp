class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int>ans(rowIndex+1,1);
        vector<int>temp(rowIndex+1,1);
        for(int row=0;row<=rowIndex;row++){
            //vector<int>temp(row+1,1);
            for(int col=1;col<row;col++){
                ans[col]=temp[col-1]+temp[col];
            }
            temp=ans;
        }
        return ans;
    }
};