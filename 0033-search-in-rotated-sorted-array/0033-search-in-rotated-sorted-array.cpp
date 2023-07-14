class Solution {
public:
    int pivotindex(vector<int>& nums,int n){
        int start=0,end=nums.size()-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(nums[mid]>=nums[0]){
                start=start+1;
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        return start;
    }
    int binarysearch(vector<int>& nums,int low,int high,int k){
        int start=low,end=high;
        int mid=start+(end-start)/2;
        //cout<<"low:"<<low<<"high:"<<end<<endl;
        while(start<=end){
            if(nums[mid]==k){
                return mid;
            }
            else if(nums[mid]<k){
                start=mid+1;
            }
            else
            {
                end=mid - 1;
            }
            mid=start+(end-start)/2;
           // cout<<"mid:"<<mid<<endl;
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int output=-1;
        //int mid=low+(end-low)/2;
        int i=pivotindex(nums,nums.size());
        cout<<i<<endl;
        if(target>=nums[i] && target<=nums[nums.size()-1]){
            output=binarysearch(nums,i,nums.size()-1,target);
        }
        else{
            output=binarysearch(nums,0,i-1,target);
        }
        //cout<<"output:"<<output<<endl;
        return output;
    }
};