// Last updated: 7/9/2026, 9:13:16 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) 
            break;
            if(i > 0 && nums[i-1] == nums[i]) 
            continue;
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sum = nums[j]+nums[k];
                if(sum < target) j++;
                else if(sum > target) k--;
                else {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    int p = j+1;
                    while(p < k && nums[p] == nums[j]) {
                        p++;
                    }
                    j = p;
                    p = k-1;
                    while(j < p && nums[k] == nums[p]) {
                        p--;
                    }
                    k = p;
                }
            }
        }
        return res;
    }
}