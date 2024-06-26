public class binarySearch {

    public static int binarySearchResult(int nums[],int low, int high, int target)
    {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if (nums[mid] == target) return mid;
        else if(nums[mid]>target) return binarySearchResult(nums, low, mid-1, target);
        else{
            return binarySearchResult(nums, mid+1, high, target);
        }
    }
    public static int search(int []nums, int target) {
        // Write your code here.
        return binarySearchResult(nums,0,nums.length-1,target);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}