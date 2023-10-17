//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    int solve(string s,char p,int i){
        int ans=-1;
        
       
        //Base condition
        if(i<0){
            return -1;
        }
        
        //processing part
        char a=s[i];
        if(a==p){
               ans=i;
               return ans;
               //return i;
            }
        return solve(s,p,i-1);
      
    }
    int LastIndex(string s, char p){
        int i=s.size()-1;
        return solve(s,p,i);
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        char p;
        cin >> p;
        Solution ob;
        cout << ob.LastIndex(s, p) << endl;
    }
    return 0;
}


// } Driver Code Ends