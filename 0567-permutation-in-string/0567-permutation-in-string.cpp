class Solution {
    bool check(int *a,int *b){
        bool flag=true;
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])flag=false;
        }
        return flag;
    }
public:
    bool checkInclusion(string s1, string s2) {
        int k=s1.size();
        int n=s2.size();
        int count=0;
        int i=0,j=0;
        int count1[26]={0};
        int count2[26]={0};
        for(int i=0;i<k;i++){
            count1[s1[i]-'a']++;
        }
        while(j<n){
           count2[s2[j]-'a']++;
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                if(check(count1,count2))return true;
                count2[s2[i]-'a']--;
                i++;
                j++;
            }
        }
        return false;
    }
};