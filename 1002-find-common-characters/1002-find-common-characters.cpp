class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<string>ans;
        vector<int>freq(26,INT_MAX);
        for(auto &i:words){
            vector<int>temp(26);
            for(auto &j:i){
                temp[j-'a']++;
            }
            for(int k=0;k<26;k++){
                freq[k]=min(temp[k],freq[k]);
            } 
            
            
        }
    
    for(int i=0;i<26;i++){
        for(int j=0;j<freq[i];j++){
            //string vec;
            //vec.push_back(i+'a');
            ans.push_back(string(1,i+'a'));
        }
    }
    return ans;
    }
};