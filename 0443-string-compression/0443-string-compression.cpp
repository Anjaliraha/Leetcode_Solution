class Solution {
public:
    int compress(vector<char>& chars) {
        vector<char>s;
        int i=0,j=0;
        int n=chars.size();
        //int cnt=1;
        while(j<n)
        {
            if(j<n-1 && chars[i]==chars[j]){
                j++;
               
            }
            else 
            {
                s.push_back(chars[i]);
               if(j-i>1 && j<=n-1 && chars[i]!=chars[j])
                {
                   
                    for(auto x:to_string(j-i))
                    s.push_back(x);
                    i=j;
                    if(j<n-1)j++;
                }
                else if(j-i+1>1 && j==n-1 && chars[i]==chars[j])
                {
                   for(auto x:to_string(j-i+1))
                    s.push_back(x);
                    i=j;
                    j++;
                }
                else if(j==n-1 && i==j){
                    j++;
                }
                 else{
                    i=j;
                }
            
            }
        }
        

        int ans = s.size();
      
        for(int i=0; i<ans; i++){
           chars[i]=s[i];
          
        }
//    for(int i=0; i<chars.size(); i++){
//            cout<<chars[i]<<" ";
          
//         }
   
        return ans;
       
    }
};