class Solution {
    public void swap(int[] nums, int index1, int index2) {
        //if (index1 >= 0 && index1 < nums.length && index2 >= 0 && index2 < nums.length) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        // }
    }


    public void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
       while (j <= k) {
                switch (nums[j]) {
                    case 0 -> {

                        // print(nums);
                        swap(nums, i, j);
                        i++;
                        j++;
                    }
                    case 1 ->
                        // print(nums);
                            j++;
                    default -> {
                        //print(nums);
                        swap(nums, j, k);
                        // j++;
                        k--;
                    }
                }
       }
    }
}