class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int zc=0,maxi=0,i=0,j=0;
        if(nums.size()<k){
            return nums.size();
        }
        if(nums.size()==k){
            return k;
        }
        while(j<nums.size())
        {
            if(nums[j]==0){
                zc++;
            }
            if(zc>k)
            {
                while(zc>k)
                {
                    if(nums[i]==0)
                    {
                        zc--;
                    }
                    i++;
                }
            }
            maxi=max(maxi,j-i+1);
            //cout<<"i: "<<i<<" "<<"j: "<<j<<" "<<"max: "<<maxi<<endl;
            j++;
        }
        return maxi;
    }
};