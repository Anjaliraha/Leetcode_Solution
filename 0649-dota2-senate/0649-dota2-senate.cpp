class Solution {
public:
    string predictPartyVictory(string senate) {
        int n=senate.length();
       queue<int>radiant,dire;
    //    radiant = 
    // dire =  2 3
    //     RDD
        for(int i=0;i<n;i++){
            if(senate[i]=='R'){
                radiant.push(i);
            }
            else{
                dire.push(i);
            }
        }
        while(!radiant.empty() && !dire.empty())
        {
            if(radiant.front()>dire.front()){
                dire.push(n++);
            }
            else{
                radiant.push(n++);
            }
            radiant.pop(),dire.pop();
        }
    return (dire.empty())?"Radiant":"Dire";
    }
};