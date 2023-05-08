class search {
    public int searchInsert(int[] nums, int target) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                temp=i;
            }
            else{
                while(nums[i]<target){
                    temp=i;
                }
            }
        }
        return temp;
    }
}
