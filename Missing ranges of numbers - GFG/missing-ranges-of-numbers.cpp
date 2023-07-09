//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{   
public:
    string findMissing(int arr[], int n) {
        // code here
        string s;
        std::sort(arr,arr+n);
        int low=0;
        int i=-1,j=0;
        if(n==1 && arr[j]==0)return to_string(low-1);
        while(j<n){
            //if(i==-1){
                if((arr[j]-low)>1 ){
                    if(low+1==arr[j]-1 && j!=0){
                        s+=std::to_string(arr[j]-1)+" ";
                    }
                    else{
                        if(j==0 ){
                        s+=std::to_string(low)+"-"+std::to_string(arr[j]-1)+ " ";
                        }
                        else{
                        s+=std::to_string(low+1)+"-"+std::to_string(arr[j]-1) + " ";
                        }
                    } 
                    low=arr[j];
                    //i++;
                    j++;
                }
                else if(j==0 && arr[j]-low==1){
                    s+=to_string(low)+" ";
                    low=arr[j];
                    j++;
                }
                else{
                    //s+=to_string(low)+" ";
                    low=arr[j];
                    j++;
                }
                //j++;
            //}
        }
        if(s.empty())return to_string(0);
        return s;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.findMissing(arr, n);
        cout << ans << "\n";
    }
    return 0;
}


// } Driver Code Ends