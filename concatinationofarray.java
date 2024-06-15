class concatinationofarray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];   // Initilize array ans of size nums.length * 2.
        for(int i=nums.length;i<ans.length;i++){   // Run a loop from nums.length to ans.length.
            ans[i-nums.length] = nums[i-nums.length];   // i-nums.length of ans Add i-nums.length of nums to the th index.
            ans[i] = nums[i-nums.length];   // Add i-nums.length of nums to the i th index of ans.
        }
        return ans;   // return ans
    }
}
