class Solution {
public:
    int mySqrt(int x) {
      long long low=0,high=x;
    unsigned int ans;
      long long mid=low+(high-low)/2;
      while(low<=high){
          if(x==mid*mid)return mid;
          else if(mid*mid<x){
              low=mid+1;
              ans=mid;
          }
          else {
              high=mid-1;
          }
          mid=low+(high-low)/2; 
      }
        return ans;
    }
};