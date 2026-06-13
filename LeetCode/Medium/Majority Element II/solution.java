class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        List<Integer> result= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
           if(map.get(nums[i]) > nums.length / 3 && !result.contains(nums[i])){
                result .add(nums[i]);
            }
        }
        return result;
    }
}