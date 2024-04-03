class numOfOccurrence {
    
        public static int firstPos(int arr[], int low, int high,int x)
        {
            int first=-1;
            while(low<=high)
            {
    
                int mid=(low+high)/2;
                if(arr[mid]==x)
                {
                    first=mid;
                    high=mid-1;
                }
                else if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return first;
        }
    
        public static int lastPos(int arr[], int low, int high,int x)
        {
            int last=-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[mid]==x)
                {
                    last=mid;
                    low=mid+1;
                }
                else if(arr[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return last;
        }

        public static int count(int nums[], int n, int target) {
            int numOccu=0;
            int firstAns=firstPos(nums,0,nums.length-1,target);
            int lastAns=lastPos(nums,0,nums.length-1,target);
            if(firstAns==-1) 
            {
                return numOccu;
            }
            else{
                numOccu=(lastAns-firstAns)+1;         
            }
            return numOccu; 
        }
        
        public static void main(String args[]) {
            int key = 13;
            int[] v = {3,4,13,13,13,20,40};
            
        
            // returning the last occurrence index if the element is present otherwise -1
            System.out.println(count(v,v.length,key));
          }
}