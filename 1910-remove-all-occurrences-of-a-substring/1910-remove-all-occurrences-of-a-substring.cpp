class Solution {
    bool check(int i,int j,string part,string s){
        bool flag=true;
        for(int x=0;x<part.size();x++){
            if(s[i+x]!=part[x])flag=false;
        }
        return flag;
    }
public:
    string removeOccurrences(string s, string part) {
        int i=0,j=0;
        int k=part.size();
        while(j<s.size()){
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                if(j<s.size()-1)j++;
                if(check(i,j-1,part,s)){
                    
                     s.erase(i,part.size());
                        i=0;
                        j=0;
                }
                   
               else i++;
            }
        }
        return s;
    }
};