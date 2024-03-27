class Solution {
    public int firstposition(int[] nums,int i,int j,int target){
        //i=low j=high mid=low+(high-low)/2
        int mid=i+(j-i)/2;
        int ans=-1;
        while(i<=j){
            if(nums[mid]==target){
               ans=mid;
            j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
           mid=i+(j-i)/2; 
        }
        return ans;
    }
      public int lastposition(int[] nums,int i,int j,int target){
        int mid=i+(j-i)/2;
          int ans=-1;
        while(i<=j){
            if(nums[mid]==target){
                ans=mid;
                i=mid+1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
           mid=i+(j-i)/2; 
        }
        return ans;
    }      

    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        //int first=-1,last=-1;
        
    int first=firstposition(nums,low,high,target);
    int last=lastposition(nums,low,high,target);
    return new int[]{first, last};
    }
}