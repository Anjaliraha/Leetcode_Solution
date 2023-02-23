//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++
#include<algorithm>

class Solution{
  public:
    int longestKSubstr(string nums, int k) {
    unordered_map<char,int>mp;
    int i=0,j=0,n=nums.length();
    int ans=INT_MIN;
    while(j<n){
        mp[nums[j]]++;
        //cout<<mp[nums[j]]<<endl;
        if(mp.size()<k){
            j++;
        }
        else if(mp.size()==k){
            ans=max(ans,j-i+1);
            j++;
        }
        else if(mp.size()>k){
            while(mp.size()>k){
                mp[nums[i]]--;
                if(mp[nums[i]]==0)mp.erase(nums[i]);
                i++;
            }
            j++;
        }
    }
    return mp.size()>=k?ans:-1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int k;
        cin >> k;
        Solution ob;
        cout << ob.longestKSubstr(s, k) << endl;
    }
}

// } Driver Code Ends