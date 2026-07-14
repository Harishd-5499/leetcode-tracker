// Last updated: 7/14/2026, 1:41:38 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer,Integer>map=new HashMap<>();
4        boolean ans=false;
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(nums[i])){
7                if(i-map.get(nums[i])>k)ans=false;
8                else return true;
9            }
10            map.put(nums[i],i);
11        }
12        return ans;
13    }
14}