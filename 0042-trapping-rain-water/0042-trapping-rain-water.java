class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=height[0];
        
        int[] right=new int[n];
        right[n-1]=height[n-1];
        int ans=0;
   
        for(int i=n-2;i>=0;i--){
            if(height[i]>right[i+1]){
                right[i]=height[i];
            }
            else{
                right[i]=right[i+1];
            }
        }
        for(int i=0;i<n;i++){
            left=Math.max(height[i],left);
            ans=ans+Math.min(left,right[i])-height[i];
        }
       // System.out.println(Arrays.toString(left));
         //  System.out.println(Arrays.toString(right));
        return ans;
    }
}