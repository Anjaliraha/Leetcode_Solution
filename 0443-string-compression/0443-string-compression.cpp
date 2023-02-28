class Solution {
public:
    int compress(vector<char>& chars) {
        vector<char>s;
        int i=0,j=0;
        int n=chars.size();
        int index=0;
        //int cnt=1;
        while(j<n)
        {
            while(j<n && chars[i]==chars[j]){
                j++;
               
            }
            
               chars[index++]=chars[i];
               if(j-i>1 )
                {
                   
                    for(auto x:to_string(j-i))
                    chars[index++]=x;
                    
                    
                }
            i=j;
            }
       // }
        

       
//    for(int i=0; i<chars.size(); i++){
//            cout<<chars[i]<<" ";
          
//         }
   
        return index;
       
    }
};