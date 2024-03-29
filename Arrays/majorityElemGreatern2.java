//majority elem > n/2
//T.C=O(N)
class majorityElemGreatern2 {
    public static int majorityElement(int[] nums) {
        int elem=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                elem=nums[i];
                count=1;
            }
            else if(nums[i]==elem) {
                count++;
            }
            else{
                count--;
            } 
        }
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==elem) count1++;
        }
        if(count1>(nums.length)/2){
            return elem;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={4,4,2,4,3,4,4,3,2,4};
        int ans=majorityElement(nums);
        System.out.println(ans);
        
    }
}