class Solution {
    public int[] getConcatenation(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int n=nums.length;
        int [] newAr= new int[2*n];
        for(int i=0; i<n; i++){
            newAr[i]= nums[i];
            newAr[i+n]= nums[i];
        }
        return newAr;
    }
}

