class Solution
{
public:
    vector<int> maxSlidingWindow(vector<int> &nums, int k)
    {
        int i = 0, j = 0;
        deque<int>list;
        vector<int> ans;
        int n = nums.size();
        int maxm = INT_MIN;
        while (j < n)
        {
         
                while(!list.empty() && list.back()<nums[j]){
                list.pop_back();
                
            }
                list.push_back(nums[j]);
              if (j - i + 1 < k){
                j++;
            }
            
           

            else if (j - i + 1 == k)
            {
                ans.push_back(list.front());
                if(nums[i]==list.front()){
                    list.pop_front();
                }
                i++;
                j++;
               
            }
        }
        return ans;
    }
};