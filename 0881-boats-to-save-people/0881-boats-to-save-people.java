class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int n=people.length;
        int j=n-1;
        int ans=0;
        while(i<=j){
            int val=people[i]+people[j];
            if(val<=limit){
                ans++;
                i++;
                j--;
                
            }
            else {
                ans++;
                j--;
            }
        }
        return ans;
    }
}