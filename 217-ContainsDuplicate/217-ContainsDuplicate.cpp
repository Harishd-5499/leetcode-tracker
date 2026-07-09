// Last updated: 7/9/2026, 9:12:19 AM
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        std::unordered_set<int> seen; 
        for (int num : nums) { 
            if (seen.count(num)) {
                return true; 
            }
            seen.insert(num); 
        }
        return false; 
    }
};