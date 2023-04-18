class Solution
{
public:
    vector<vector<int>> fourSum(vector<int> &nums, int target)
    {
        int i = 0;
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        // if(nums.size()<4)return ans;
        int n=nums.size();
       for(int i=0;i<n-2;i++)
        {
           //cout<<i<<endl;
            if(i>0 and nums[i]==nums[i-1])
            continue;
            
           // int j = i + 1;
            for(int j=i+1;j<n-1;j++)
            {
                if (j > i + 1 and nums[j] == nums[j - 1])
                    continue;
                long long int v1 = (long long int)nums[i];
                long long int v2 = (long long int)nums[j];
                long long int targetsum = (long long int)target - v1 - v2;
                long long int k = (long long int)j + 1;
                long long int l = (long long int)nums.size() - 1;

                while (k < l)
                {
                    vector<int> temp;
                    long long int v3 = (long long int)nums[k];
                    long long int v4 = (long long int)nums[l];
                    // cout<<"["<<v1<<","<<v2<<","<<v3<<","<<v4<<"]"<<endl;
                    if (v3 + v4 == targetsum)
                    {
                        temp.push_back(v1);
                        temp.push_back(v2);
                        temp.push_back(nums[k]);
                        temp.push_back(nums[l]);
                        ans.push_back(temp);
                        long long int kv = v3;
                        long long int lv = v4;
                        while (k < l && kv == nums[k])
                            k++;
                        while (l > k && lv == nums[l])
                            l--;
                    }
                    else if (v3 + v4 < targetsum)
                        k++;
                    else
                        l--;
                }
                //j++;
            }
            //i++;
        }
        return ans;
    }
};