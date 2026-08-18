class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Arrays.sort(nums);
       Set<List<Integer>> result = new LinkedHashSet<>();

        int sum =0;
        for(int i =0; i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
        int left = i + 1;
        int right = nums.length - 1;
            while(left < right){
                sum = nums[i]+nums[left]+nums[right];

                 if (sum == 0) {
            List<Integer> triplet =
                Arrays.asList(nums[i], nums[left], nums[right]);

                result.add(triplet);

            right--;
            left++;
                 }
                else if(sum>0){
                    right--;
                }
                else {
                    left++;
                }
        }
        }
    return new ArrayList<>(result);
        }
}
